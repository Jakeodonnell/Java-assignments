package laboration9;

import javax.swing.JFrame;

public class StartAll {
	public void Start() {
		JFrame frame = new JFrame( "Multifunktionell grej by Jake" );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add( new AllPanels() ) ;
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) { 
		StartAll sa = new StartAll(); 
		sa.Start();
	}

}
