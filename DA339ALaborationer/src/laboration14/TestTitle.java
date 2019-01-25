package laboration14;


import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestTitle extends JPanel{

	private Title title1 = new Title ("Rött och svart", Font.BOLD, 20, Color.red, Color.black);
	private Title title2 = new Title("Blå text - gul bakgrund", Font.PLAIN, 10, Color.blue, Color.yellow);
	private Title title3 = new Title("Denna rubrik är i south", Font.ITALIC, 10, Color.WHITE, Color.black);


	public TestTitle() {
		setPreferredSize(new Dimension ( 400, 150 ));
		setLayout(new BorderLayout());

		add(title1, BorderLayout.NORTH);
		add(title2, BorderLayout.CENTER);
		add(title3, BorderLayout.SOUTH);
	}

	public static void main(String[] args) { 

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				frame.add(new TestTitle());
				frame.pack();
				frame.setVisible(true);
			} }
				);
	} }
