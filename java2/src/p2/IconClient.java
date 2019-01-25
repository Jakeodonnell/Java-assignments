package p2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 * 
 * @author JakeODonnell
 * IconClient is a runnable class that recives an inputstream from the server and then
 * adds the icon recived to the callback arraylist.
 */

public class IconClient implements Runnable{
	private ArrayList<Callback> callback = new ArrayList<Callback>();
	private Icon icon;
	private Thread client = new Thread(this);
	private String ip;
	private int port;

	/**
	 * IconClient is a constructor with a string and interger in the parameterlist,
	 * the construktor also uses the start method to execute the thread which calls the 
	 * run method.
	 * @param ip
	 * @param port
	 */

	public IconClient(String ip, int port) {
		this.port = port;
		this.ip = ip;
		client.start();
	}

	/**
	 * When the run method is executed it tries to create a new socket with the given ip and port.
	 * The Stream is also created.
	 * 
	 * The run method then read the objects sent through the stream and places it in 
	 * the "icon" variable and notifys the callback.
	 * 
	 * 	
	 */
	
	@Override
	public void run() {
		try(Socket socket = new Socket(ip, port)){
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			while(true) {

				try{
					icon = (Icon)ois.readObject();
					notifyCallback(icon);


				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * adds the icon to the end of the list in the arraylist "Callback"
	 * @param icon
	 */
	
	public void addCallback(Callback icon) {
		callback.add(icon);
	}

	/**
	 * This method goes through the arraylist of icons and uses the metod in the Callback interface.
	 * the icon sent is then used to set the JLabel icon in P2Viewer.
	 * @param icon
	 */
	
	public void notifyCallback(Icon icon) {
		for(int i = 0; i < callback.size(); i++) {
			callback.get(i).Send(icon);
		}
	}
}
