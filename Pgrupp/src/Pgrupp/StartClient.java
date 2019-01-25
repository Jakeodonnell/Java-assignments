package Pgrupp;

import javax.swing.SwingUtilities;

public class StartClient {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					new ClientController("localhost", 1337);
					new ClientController("127.0.0.1", 1337);
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
			}
		});
	}
}