package p2Granskning;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;



/**
 * 
 * @author lukas
 *Server gets Icons from {@linkIconManager } and sends then to the client 
 *Server awaits client connection and when established a new thread is being made for every client
 */
public class IconServer extends Thread implements Observer {
	private List<Icon> iconList = new ArrayList<Icon>();
	private ServerSocket serverSocket;
	IconManager iconManager;
	private int port;
	private enum SendOption {LOOP,SET}; 
	private SendMethod sendMethod;
	
	
	
	
	private synchronized void setSendMethod(SendOption sp) {
		switch(sp) {
		case LOOP:{
			sendMethod=new SendLoop();
			break;
		}
		case SET:{
			sendMethod=new SendOne();
			break;
		}
		}
	}
	
	/**
	 * Constructor for the server
	 * establishes reference to iconManager and registers it self in it
	 * defines port and starts ServerSocket
	 * att the end a thread with socket listener is started 
	 **/
	
	public IconServer(IconManager iconManager, int port) {

		this.iconManager = iconManager;
		this.iconManager.addObserver(this); // !!!!!!!!!!!!!!!!!!!!!!!! observer has to be added to observable
		this.port = port;

		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.start();
	}

	public void run() {
		while (true) {
			try {
				/*
				 * socket blocks awaiting connection, when established 
				 * a separat thread is started for stream handling
				 */
				Socket socket = serverSocket.accept();
				// System.out.println("server acceptetd true");
				new ServerStreams(socket).start();
			} catch (IOException e) {

				System.out.println(e);
			}
		}
	}


	// icon change when observable iconManager setChanged()==true
	public void update(Observable obs, Object obj) {
		
		 synchronized(iconList) {
		iconList.add((ImageIcon) obj);

		// this.start(); // Starts the server socket after first icon in the List
		// System.out.println("Server Icon added to icon list");
		// System.out.println(getIconList());
	}
	}

	/**
	 * makes a list of Icons in a List
	 * @return String
	 */
	private String getIconList() {
		String s = "Server icon list \n";
		for (int i = 0; i < iconList.size(); i++) {
			s += iconList.get(i) + "\n";
		}
		return s;
	}

	/**
	 *server send thread is constructed in such a way that it loops thru the Icons in the list and
	 *sends them to client 
	 *There's no way for a thread that started successfully to stop   start(), stop() should be defined
	
	 * @author lukas
	 *
	 */
	private class ServerStreams extends Thread {
		Socket socket;
		public ServerStreams(Socket s) {
			this.socket = s;
		}

		public void run() {
			try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
						) {

				String sendOptionRequest=null;
				try {
					sendOptionRequest = (String)ois.readObject(); // client request icon as a set or loop
					System.out.println(sendOptionRequest);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/// sends back to client based on the type of request made
					if(sendOptionRequest.equals("LOOP")) {
							setSendMethod(SendOption.LOOP);
					}else if(sendOptionRequest.equals("SET")) {
						setSendMethod(SendOption.SET);
					}
				
			//		setSendMethod(SendOption.LOOP);
			//	setSendMethod(SendOption.ONE_SET);
				sendMethod.send(iconList, oos);
				
				
				
				
				
			} catch (IOException e) {

				System.out.println("Server dos problem: " + e);
			}
		}
	}
}
