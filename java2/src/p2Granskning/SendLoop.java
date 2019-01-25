package p2Granskning;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;



/**
 * Child class for {@link SendMethod}
 * @author lukas
 *
 */
public class SendLoop extends SendMethod {

	@Override
	public void send(List l, ObjectOutputStream oos) {
		while (true) {
			// tries to send something only if list with icons not null
			if (!l.isEmpty()) {
				for (int i = 0; i < l.size(); i++) {
					Icon icon = (ImageIcon) l.get(i);
					try {
						oos.writeObject(icon);
						oos.flush();

						// System.out.println("Server send icon: " + icon);
					} catch (IOException e) {

						// System.out.println("Server problem sending icon: " + e);
						e.printStackTrace();
					}
				}
			}
		}
	}

}
