package laboration7;

import javax.swing.JOptionPane;

public class HouseTest {
	public void Run() {
	House h1 = new House(1972, 142, 620);
	JOptionPane.showMessageDialog(null, h1.toString() );
}

public static void main (String [] args) {
	HouseTest ht = new HouseTest();
	ht.Run();
	}	
}