package Server;
import java.io.IOException;
import java.net.ServerSocket;

import server.Server.Client.ConnectionClient;

public class Server {
	private ServerSocket sensorSocket;
	private ServerSocket clientSocket;
	
	public Server(int portClient, int portSensor) {
		try {
			sensorSocket = new ServerSocket(portSensor);
			clientSocket = new ServerSocket(portClient);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public class Client {
		private ServerSocket socket;
		
		public Client(ServerSocket portClient) {
			this.socket = serverSocketClient;
			new ConnectionClient().start();
		}
	}
	
	public class Sensor {
		
	}
	public static void main(String[] args) {
		int client = 12345;
		int sensor = 12346;
		Server server = new Server(client, sensor);
	}
}
