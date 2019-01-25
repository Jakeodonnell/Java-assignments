package p2Granskning;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Set;

public abstract class ReceiveMethod {

	public void recieve(Socket socket,String thisName,Status status,Set iconSet,List<Callback> callbackList, Thread thread) {
		new InvalidSendMethodException("Wrong receive method  only LOOP and ONE_SET allowed");

}
}
