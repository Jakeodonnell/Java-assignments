package p3;

import javax.swing.*;

public class SSPRun {

	public static void main( String[] args ) {
	
		SSPViewer viewer = new SSPViewer();
		JFrame frame = new JFrame( "SSPViewer" ); 
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( viewer );
		frame.pack();
		frame.setVisible( true );
	}
}