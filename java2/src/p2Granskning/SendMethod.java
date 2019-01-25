package p2Granskning;

import java.io.ObjectOutputStream;
import java.util.List;


/**
 * abstract for the servers send method used with {@link SendOne} or {@link SendLoop}
 * @author lukas
 *
 */
public abstract class SendMethod {
	
	public void send(List l, ObjectOutputStream oos ) {
			new InvalidSendMethodException("Wrong send method  only LOOP and ONE_SET allowed");
	
	}
}
