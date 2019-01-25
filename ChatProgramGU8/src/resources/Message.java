package resources;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/**
 * A class that represents a message 
 * 
 * @author elinolsson
 *
 */
public class Message implements Serializable {
	private static final long serialVersionUID = 1516088037980799826L;
	private User sender;
	private UserList receivers;
	private String text;
	private ImageIcon image;
	private String delivered;
	private String received;

	/**
	 * Constructor
	 * 
	 * @param sender
	 *            - the sender of the message
	 * @param receivers
	 *            - the recievers of the message
	 */
	public Message(User sender, UserList receivers) {
		this.sender = sender;
		this.receivers = receivers;
	}

	/**
	 * 
	 * @param sender
	 *            -the sender of the message
	 * @param receivers
	 *            - the recievers of the message
	 * @param text
	 *            - the text sent
	 */
	public Message(User sender, UserList receivers, String text) {
		this(sender, receivers);
		this.text = text;
	}

	/**
	 * 
	 * @param sender
	 *            -the sender of the message
	 * @param receivers
	 *            - the recievers of the message
	 * @param text
	 *            - the text sent in a message 
	 * @param image - the image sent in a message 
	 */
	public Message(User sender, UserList receivers, String text, ImageIcon image) {
		this(sender, receivers, text);
		this.image = image;
	}
/**
 * Getter for the sender 
 * @return sender - the sender
 */
	public User getSender() {
		return sender;
	}
/**
 * Getter for the recievers
 * @return recievers - the recevers 
 */
	public UserList getReceivers() {
		return receivers;
	}
/**
 * Setter for the text sent
 * @param text - the text sent 
 */
	public void setText(String text) {
		this.text = text;
	}
/**
 * Getter for the text sent
 * @param text - the text sent
 */
	public String getText() {
		return text;
	}
/**
 * Setter for the image sent
 * @param image - the image sent
 */
	public void setImage(ImageIcon image) {
		this.image = image;
	}
	/**
	 * Getter for the image sent
	 * @param image - the image sent
	 */
	public ImageIcon getImage() {
		return image;
	}
/**
 * Sets the date that the message was delivered 
 */
	public void setDeliveredDate() {
		if (delivered == null) {
			this.delivered = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		}
	}
/**
 * Getter for the date that the message was delivered
 * @return delivered - the date 
 */
	public String getDeliveredDate() {
		return delivered;
	}
	/**
	 * Setter for the date that the message was recieved
	 * @return recieved - the date 
	 */
	public void setReceivedDate() {
		if (received == null) {
			this.received = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		}
	}
/**
 *  Getter for the date that the message was recieved
 * @return recieved - the date 
 */
	public String getReceivedDate() {
		return received;
	}
/**
 * toString method that prints a message 
 * @return a string 
 */
	public String toString() {
		return "(" + super.toString() + ") Sender: " + sender + " Receivers: " + receivers + " Text: " + text
				+ " Image: " + image + " Delivered: " + delivered + " Received: " + received;
	}
}
