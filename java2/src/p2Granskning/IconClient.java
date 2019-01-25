package p2Granskning;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconClient extends Thread {
	// private Buffer<Icon> buffer = new Buffer<Icon>();// private buffer for
	// incoming icons
	private List<Icon> iconList = new LinkedList<Icon>();
	private Set<Icon> iconSet = new HashSet<Icon>();
	private List<Callback> callbackList = new ArrayList<Callback>();
	private Status status = new Status(); // my private thing nothing to do with p2
	private String thisName ="";// my private thing nothing to do with p2
	private Socket socket=null;
	private ClientStreams clientStreams=null;
	private String ip;
	private int port;
	private enum ReceiveOption {LOOP,SET}
	private ReceiveMethod receiveMethod;
	
	
	
	public void setReceiveMethod(ReceiveOption ro) {
		switch(ro) {
		case LOOP:{
			receiveMethod=new ReceiveLoop();
			break;
		}
		case SET:{
			break;
		}
		}
	}
	
	
	/**
	 * defines ip port and name 
	 * @param ip
	 * @param port
	 * @param name must be given ex. client1. name is used in {@link Status} 
	 */
	public IconClient(String ip, int port,String name) {
		status.addItem(name);
		this.ip = ip;
		this.port = port;
		this.thisName=name;
		this.start();
	}

	
	/**
	 * Adds callbacks to a list of callbacks
	 * since there can be more then one viewer
	 * @param c
	 */
	public void addCallback(Callback c) {
		this.callbackList.add(c);
		System.out.println("Client callback added");
	}
	
	/**
	 * main thread for this class
	 * tries to make a connection to a server until it connects
	 */
	public void run() {
		try {
			this.sleep(1000); // sync problem... client must be delayed so that server can establish it self
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(socket==null) {
			
		try {
			status.getItem(thisName).setSocketStatus("Client awaiting connection");
			socket = new Socket(ip, port);
			status.getItem(thisName).setIp(""+socket.getRemoteSocketAddress());
			status.getItem(thisName).setSocketStatus("Client socket open " + socket.isBound());
//			System.out.println(
//					"Client socket is bound to address " + socket.isBound() + " " + socket.getRemoteSocketAddress());
			clientStreams = new ClientStreams(socket);
					clientStreams.start();
			status.getItem(thisName).setMessage("Client stream starts ");	
	//		System.out.println("Client starts listening");
	//		break;
		} catch (IOException e) {
			status.getItem(thisName).setSocketStatus("Client problem with socket " +e);
	//		System.out.println("Client problem with socket or stream");
	//		System.out.println(e);
		}
		}
	}
	

 
	private String getIconSet() {
		String s = "Client icon list \n";
		for (Icon i:iconSet) {
			s += i.toString() + "\n";
		}
		return s;
	}
	
	
	/**
	 * Sends a request a loop or a set
	 * then awaits data from server
	 * if request is a loop data is going to be send all the time
	 * if request is a set data is going to be send one time.... this is buggy but works
	 * @author lukas
	 *
	 */
	private class ClientStreams extends Thread {
		Socket socket;

		public ClientStreams(Socket s) {
			this.socket = s;
		}

		public void run() {

			try (ObjectInputStream dis = new ObjectInputStream(socket.getInputStream());
					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
				status.getItem(thisName).setInputStreamStatus("OPEN");
				status.getItem(thisName).setOutputStreamStatus("OPEN");
				
				try {
//					oos.writeObject("LOOP");	//One of two possible ways of getting icons from server
					oos.writeObject("SET");	//   set still kind of buggy  but works
					oos.flush();
				}catch(IOException e) {status.getItem(thisName).setSendResource("Request send to server");}
				
				
				
				
				
				/*
				 * two ways of doing this
				 * 1. Server sends Icons over and over again and client updates viewer directly
				 * 2. Server sends a set of Icons ones, this still buggy
				 * 
				 * here 1 used     
				 * 
				 * in the future viewer updates going to be in separate thread Icons are going to be saved in a list and then updated in viewer
				 * problem for now is that icon can come not in order and a Map cant sort icons
				 */
				while (true) {
					try {
						this.sleep(50);  // slows down icons in viewer 
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Icon icon =(ImageIcon) dis.readObject();
						iconSet.add(icon);
						status.getItem(thisName).setRecievedResource("Client getting icon: " + icon);
						status.getItem(thisName).setResourceList(getIconSet());
			//			System.out.println("Client gets icon: " + icon);
						
						if(!callbackList.isEmpty()) {		
						// goes through the list of callbacks and sends to all
						for(Callback c:callbackList) {
							c.update(icon);
							status.getItem(thisName).setSendResource("Cleint sends to viewer"+icon);
						}
						
			//			System.out.println("Client send to viewer icon: " + icon);
						}

					} catch (Exception e) {
						status.getItem(thisName).setRecievedResource("Client problem getting icon: " + e);
			//			System.out.println("Client problem getting icon: " + e);
						e.printStackTrace();
						break;
					}
				
				}

				
				
			} catch (IOException e) {
				status.getItem(thisName).setMessage("Client dis problem: " + e);
	//			System.out.println("Client dis problem: " + e);
			}
		}
	}
}