package Pgrupp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class ClientUI extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClientController controller;
	private JTextPane chatField = new JTextPane();
	private JTextPane writeChat = new JTextPane();
	private JButton send = new JButton ("Send");

	public ClientUI (ClientController controller) {
		this.controller=controller;
		JPanel p = new JPanel();

		setLayout (new BorderLayout());
		chatField.setEditable(false);

		//Center:
		add(chatField, BorderLayout.CENTER);
		chatField.setPreferredSize(new Dimension(400,500));

		//South(panel in panel):
		add(p, BorderLayout.SOUTH);

		p.add(writeChat, BorderLayout.CENTER);
		writeChat.setPreferredSize(new Dimension(400,100));

		p.add(send, BorderLayout.SOUTH);
		send.setPreferredSize(new Dimension(100,100));

		//ActionListeners
		send.addActionListener(this);

	}
	
	public void addResponse(final String response) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				chatField.setText(response + "\n");
				controller.sendMessage("GET");
			}
		});
	}

	public String time() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = ("\nSent: " + dateFormat.format(date) + "\n");
		return s;
	}

	public void actionPerformed(ActionEvent e)  {
		if(e.getSource() == send) {
			controller.sendMessage( "PUT" + controller.getName() + writeChat.getText().trim() + time());
			writeChat.setText("");
		}
	}
}