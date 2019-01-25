package p3granskning;

import javax.swing.JFrame;
/**
 * En variant av spelet Sten Sax Påse. Programmet visas i två fönster (SSPViewer och SSPInput)
 * Programmet startas från denna klass, SSPMain.
 * @author eriklundow
 *
 */
public class SSPMain {

//Main metod som skapar två JFrames och placerar klasserna SSPViewer och SSPUserInput i vardera fönster.
public static void main( String[] args ) {
	SSPPlayer player = new SSPPlayer();
	SSPViewer viewer = new SSPViewer();

	SSPController controller = new SSPController(player, viewer); 

	SSPUserInput userInput = new SSPUserInput(controller);

	JFrame frame1 = new JFrame( "SSPViewer" ); 

	frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
	frame1.add( viewer );
	frame1.pack();
	frame1.setLocation(500, 50);
	frame1.setVisible( true );
	JFrame frame2 = new JFrame( "SSPUserInput" ); 
	frame2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
	frame2.add( userInput );
	frame2.pack();
	frame2.setLocation(450,480);
	frame2.setVisible( true ); 

	
}
}