package p2Granskning;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.Icon;

/**
 * 
 * @author lukas
 *
 *Looped Server with buffer and new thread for every client
 */
public class ThreadedBufferedLoopServer implements Callback{
	private Buffer<Icon> buffer = new Buffer<Icon>();// private buffer for incoming icons 
	private ServerSocket serverSocket;
	private Socket socket;
	private ServerStreams serverStream=null;
	
	public ThreadedBufferedLoopServer(int port) {
		while(true) {
			try {
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();
			System.out.println("Socket is bound to address " + socket.isBound());
			serverStream = new ServerStreams();
			serverStream.start();
			}catch(IOException e) {System.out.println(e);}
		}
	}
	/**
	 * for server
	 * a way to get icons from private buffer
	 */
	private Icon get() {//no sync
		Icon icon=null;
		try {
		icon=buffer.get();	// waits in buffer if buffer empty
		}catch(InterruptedException e) {System.err.println(e);}
		return icon;
	}
	
	/**
	 * for incoming icons 
	 * icons go to private buffer
	 */
	@Override //ServerCallback interface
	public void update(Object o) {
		if(o instanceof Icon)
		this.buffer.put((Icon)o);
	}
	
	///stream start stop 
	
	private class ServerStreams extends Thread{
		public void run() {
			try(	ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream());
				/*DataInputStream dis = new DataInputStream(socket.getInputStream())*/) {
				while(true) {
					Icon icon=get();  // get icon from buffer waits in buffer if isEmpty
					dos.writeObject(icon);
				}
				
				
				
			}catch(IOException e) {System.out.println(e);}
		}
	}
}
