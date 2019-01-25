package p2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;

/**
 * 
 * @author JakeODonnell
 * This class is a server that can handle multiple clients, it implements the interface runnable
 * so we can use threads.
 * The clients are handled by an inner class caled Clienthandler, this class implements the
 * interface Observer.
 * 
 */


public class IconServer implements Runnable{
	private Thread server = new Thread(this); 
	private IconManager iconManager;
	private int port;

	/**
	 * IconServer is a constructor with a parameter list of IconManagers and integers.
	 * this construktor also uses the start method which executes the thread and the run meathod is called.
	 * @param iconManager
	 * @param port
	 */

	public IconServer(IconManager iconManager, int port) {
		this.iconManager = iconManager;
		this.port = port;
		System.out.println("Welcome, server is starting....please wait....\n");
		server.start();
	} 

	private class ClientHandler implements Observer {
		private Socket socket;
		private ObjectOutputStream oos;

		/**
		 * ClientHandler creates a new stream for obejct to get sent through.
		 * The destination is set by the socket.
		 * @param socket
		 */
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			try {
				oos = new ObjectOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}

		
		/**
		 * The update method writes an object only if it is an instance of icon, then it
		 * flushes.
		 */
		
		public void update(Observable o, Object arg) {
			if(arg instanceof Icon) {
				Icon icon = (Icon)arg;
				try {
					oos.writeObject(icon);
					oos.flush();
				} catch (IOException e) {
					iconManager.deleteObserver(this);
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This run method is called when the thread is executed, The serverSocket is based on the
	 * given port. When a client is connected the observer notices this and and creates a new 
	 * clienthandler with the socket connected as a parameter.
	 * 
	 */
	public void run() {
		try(ServerSocket serverSocket = new ServerSocket(port)) {
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("Client connected!");
				iconManager.addObserver(new ClientHandler(socket));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}