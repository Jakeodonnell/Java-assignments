package laboration9;

import javax.swing.JFrame;

public class FCConverterStart {
	public void fccstart() {
		JFrame frame = new JFrame( "Farenheit <----> Celcius" );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add( new ClientUI() ); 
		frame.pack(); 
		frame.setVisible(true);
	}
	public static void main(String[] args) { 
		FCConverterStart fcc = new FCConverterStart(); 
		fcc.fccstart();
	}
}
