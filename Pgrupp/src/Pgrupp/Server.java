package Pgrupp;

import java.net.*;
import java.io.*;

public class Server {
	private DatagramSocket socket;
	private ClientListener clientListener;
	private Thread listener = new Thread(new UDPListener());
	
	public Server(int requestPort, ClientListener clientListener) {
		this.clientListener = clientListener;
		try {
			socket = new DatagramSocket(requestPort); 
			listener.start();
		} catch(Exception e) { 
			System.err.println(e);
		}
	}
	
	public void stop() {
		socket.close();
		listener.interrupt();
	}

	public void send(InetAddress address, int clientPort, String str) {
		if(socket!=null) {
			byte[] data = str.getBytes();
			DatagramPacket packet = new DatagramPacket(data,data.length,address,clientPort);
			try {
				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private class UDPListener extends Thread {
		public void run() {
			DatagramPacket packet;
			byte[] readBuffer = new byte[1024];
			while(!Thread.interrupted()) {
				try {
					packet = new DatagramPacket(readBuffer,readBuffer.length);
					socket.receive(packet);		
					clientListener.receive(new String(packet.getData(),0,packet.getLength()), packet.getAddress(),packet.getPort());
				} catch(Exception e) { 
					break; // socket.close();
				}
			}
		}
	}
}
