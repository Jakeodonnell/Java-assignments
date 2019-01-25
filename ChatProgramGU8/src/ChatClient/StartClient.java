package ChatClient; 
import javax.swing.SwingUtilities; 
/**
 *	Starts up the clients thread and sets up the ip and port for the client to connect to
 * @author Matthias Falk
 *
 */
public class StartClient {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					new ClientController("192.168.1.42",3300);
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
			}
		});
	}
}