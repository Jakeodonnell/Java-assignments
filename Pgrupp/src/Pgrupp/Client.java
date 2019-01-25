package Pgrupp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	private int SERVERPORT;
	private DatagramSocket socket;
	private ServerListener serverListener;
	private InetAddress address;
	private Thread listener = new Thread(new UDPListener());

	public Client(String ipAddress, int port, ServerListener serverListener) {
		this.SERVERPORT = port;
		this.serverListener = serverListener;
		try {
			// ipAddress = ipadressen host hosten.
			this.address = InetAddress.getByName(ipAddress);

			//öppnar en socket hos lokala hosten
			this.socket = new DatagramSocket();

			//startar Thread
			this.listener.start();

		} catch(Exception e) { 
			System.err.println(e);
		}
	}

	public Client(Socket socket2) {
		// TODO Auto-generated constructor stub
	}

	public void stop() {
		socket.close();
		listener.interrupt();
	}

	//skickar paket som ett DatagramPaket, måste göras om från sträng till Datagrampaket
	public void send(String str) {
		if(socket!=null) {
			byte[] data = str.getBytes();
			DatagramPacket packet = new DatagramPacket(data,data.length,address,SERVERPORT);
			try {
				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//tar emot paket
	private class UDPListener extends Thread { 
		public void run() {
			DatagramPacket packet;
			byte[] readBuffer = new byte[1024];
			{
				while(!Thread.interrupted()) {
					try {
						packet = new DatagramPacket(readBuffer, readBuffer.length);
						socket.receive(packet);
						String response = new String(packet.getData(),0,packet.getLength());
						serverListener.receive(response);

					} catch(Exception e) { // InterruptedException, IOException 
						break; // socket.close();} 
					}
				}
			}    
		}
	}
}
