package Workshop;

import javax.swing.ImageIcon;

public class SendWindow {
	
	private Controller controller;
	private List<String> userList;
	private String title;
	private String content;
	private ImageIcon image;
	private int[] receivers;
	
	public SendWindow(String title, String content, ImageIcon image, int[] receivers) {
		this.title = title;
		this.content = content;
		this.image = image;
		this.receivers = receivers;
	}
	


	public void setTitle(String title) {
		this.title = title;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setImage(ImageIcon image) {
		this.image = image;
	}


	public void setReceivers(int[] receivers) {
		this.receivers = receivers;
	}

	
	public int[] getRecivers() {
		return receivers;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public ImageIcon getImage () {
		return image;
	}


}
