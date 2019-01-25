package p2Granskning;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ReceiveLoop extends ReceiveMethod{
	
	
	public void recieve(Socket socket,String thisName,Status status,Set iconSet,List<Callback> callbackList, Thread thread) {
		try (ObjectInputStream dis = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
			status.getItem(thisName).setInputStreamStatus("OPEN");
			status.getItem(thisName).setOutputStreamStatus("OPEN");
			
			try {
				oos.writeObject("LOOP");
			//	oos.writeObject("SET");
				oos.flush();
			}catch(IOException e) {status.getItem(thisName).setSendResource("Request send to server");}
			
			
			
			
			
			/*
			 * two ways of doing this
			 * 1. Server sends Icons over and over again and client updates viewer directly
			 * 2. Server sends a set of Icons ones, .
			 * 
			 * here 1 used     
			 * 
			 */
			while (true) {
				try {
					thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Icon icon =(ImageIcon) dis.readObject();
					iconSet.add(icon);
					status.getItem(thisName).setRecievedResource("Client getting icon: " + icon);
		//			status.getItem(thisName).setResourceList(getIconSet());
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
				}
			
			}
		} catch (IOException e) {
			status.getItem(thisName).setMessage("Client dis problem: " + e);
//			System.out.println("Client dis problem: " + e);
		}

}
	}
