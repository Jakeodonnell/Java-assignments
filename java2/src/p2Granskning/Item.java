package p2Granskning;

public class Item {
	private  String name="";
	private  String serverSocketStatus ="";
	private  String serverInputStreamStatus ="";
	private  String serverOutputStreamStatus ="";
	private  String serverPrivateDataStatus ="";
	private  String serverSend ="";
	private  String serverRecieved ="";
	private String message ="" ;
	public Item(String n) {
		name=n;
	}
	public  void setInputStreamStatus(String s) {
		serverInputStreamStatus = s;

	}
	public  void setOutputStreamStatus(String s) {
		serverOutputStreamStatus = s;

	}
	public  void setPrivateDataStatus(String s) {
		serverPrivateDataStatus = s;

	}
	public  void setRecieved(String s) {
		serverRecieved = s;

	}
	public  void setSendResource(String s) {
		serverSend = s;

	}
	public  void setSocketStatus(String s) {
		serverSocketStatus = s;

	}
	public void setMessage(String message) {
		this.message = message;

	}
	public  String showStats() {
		return "*********ITEM STATUS    ----     START********"+
				"\n * Name = "+name+
				"\n * SocketStatus = "+serverSocketStatus+
				"\n * message = "+message+
				"\n * InputStreamStatus = "+serverInputStreamStatus+
				"\n * OutputStreamStatus = "+serverOutputStreamStatus+
				"\n * PrivateDataStatus = "+serverPrivateDataStatus+
				"\n * Send = "+serverSend+
				"\n * Recieved = "+serverRecieved+
				"*********ITEM STATUS    ----     END********";

	}
}
