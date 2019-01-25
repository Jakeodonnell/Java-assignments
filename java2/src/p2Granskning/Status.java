package p2Granskning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Prints full info about a particular connection
 * 
 * @author lukas
 *
 */
public class Status {
	private Map<String, Item> map = new TreeMap<String, Item>();

	/**
	 * 
	 * @param name
	 *            type and name ex. "Server 1"
	 */
	public void addItem(String name) {

		map.put(name, new Item(name));
		getStatus();
	}

	public Item getItem(String name) {
		return map.get(name);
	}

	protected class Item {
		private String name = "";
		private String serverSocketStatus = "";
		private String serverInputStreamStatus = "";
		private String serverOutputStreamStatus = "";
		private String serverPrivateDataStatus = "";
		private String serverSend = "";
		private String serverRecieved = "";
		private String message = "";
		private String ip = "";
		private String resourceList = "";

		public Item(String n) {
			name = n;
		}

		public void setInputStreamStatus(String s) {
			serverInputStreamStatus = s;
			getStatus();
		}

		public void setOutputStreamStatus(String s) {
			serverOutputStreamStatus = s;
			getStatus();
		}

		public void setPrivateDataStatus(String s) {
			serverPrivateDataStatus = s;
			getStatus();
		}

		public void setRecievedResource(String s) {
			serverRecieved = s;
			getStatus();
		}

		public void setSendResource(String s) {
			serverSend = s;
			getStatus();
		}

		public void setSocketStatus(String s) {
			serverSocketStatus = s;
			getStatus();
		}

		public void setMessage(String m) {
			message = m;
			getStatus();
		}

		public void setIp(String s) {
			ip = s;
		}

		public void setResourceList(String s) {
			resourceList = s;
		}

		public String showStats() {
			return "*********           ITEM STATUS    ----     START       ********" + "\n * Name = " + name
					+ "\n * Ip = " + ip + "\n * SocketStatus = " + serverSocketStatus + "\n * message = " + message
					+ "\n * InputStreamStatus = " + serverInputStreamStatus + "\n * OutputStreamStatus = "
					+ serverOutputStreamStatus + "\n * PrivateDataStatus = " + serverPrivateDataStatus + "\n * Send = "
					+ serverSend + "\n * Recieved = " + serverRecieved
					+ "\n * resourceList = " + resourceList
					+ "\n*********        ITEM STATUS    ----     END         ********";

		}

	}

	public void getStatus() {
		String temp = "";
		Set<String> keys = map.keySet();
		for (String key : keys) {
			temp += map.get(key).showStats();
		}
		System.out.println(temp);
	}

}
