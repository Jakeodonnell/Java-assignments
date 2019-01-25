package Pgrupp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ClientController{
	private ClientUI clientUI = new ClientUI(this);
//	private PersonToTalkTo ptt = new PersonToTalkTo();
	private Client connection;
	private String name;
	private String startmessage = "CONNECTED";

	public ClientController(String ipAddress, int port) {
		ServerListener listener = new ServerListener() {
			public void receive(String s) {
				clientUI.addResponse(s);

			}
		};
		try {			
			connection = new Client(ipAddress,port,listener);
			showClient();
		} catch(Exception e) { 
			System.err.println(e); 
		}
	}

	private void showClient() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				connection.send(startmessage);
				clientUI = new ClientUI(ClientController.this);
//				ptt = new PersonToTalkTo();
				
				name = JOptionPane.showInputDialog("Enter Name:") + ": ";
				JFrame frame = new JFrame("Welcome " + name);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(clientUI);
				frame.pack();
				frame.setVisible(true); 
			}
		});
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		connection.send(message);
	}

	public void exit() {
		connection.stop();
		System.exit(0);
	}
}
