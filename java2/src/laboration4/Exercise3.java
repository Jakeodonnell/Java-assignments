package laboration4;

import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import laboration4.Exercise1.Start;

public class Exercise3 extends Thread{
	private String[] messages; 
	private JLabel lblText;
	private long pause;
	private boolean yes;

	private int index = 0;

	public Exercise3(String[] messages, JLabel label, long pause) { 
		this.messages = messages;
		this.lblText = label;
		this.pause = pause;
		yes = (messages!=null) && (messages.length > 0) && 
				(label!= null) && (pause >= 0);
	}

	public void run() {
		while( yes && !interrupted()) {
			SwingUtilities.invokeLater( new Write(messages[index]) ); 
			index = (index + 1) % messages.length;
			try { 
				Thread.sleep(pause);
			} catch(InterruptedException e) {
				break; }
		} 
	}
	class Write implements Runnable {
		private String message;

		public Write(String message) {
			this.message = message;
		}

		public void run() { 
			lblText.setText(message);
		} 
	}
	public static void main(String[] args) { SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			JFrame frame = new JFrame();
			JLabel lblText = new JLabel();
			String[] texter = {"Det är två månader kvar på året",
					"23 * 6735 = 154905",
			"Den 28 oktober har Simone namnsdag"}; lblText.setPreferredSize(new Dimension(400,40));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.add(lblText);
			frame.pack();
			frame.setVisible(true);
			Exercise3 ex3 = new Exercise3(texter, lblText, 3000);
			ex3.start(); }
	}); }
}