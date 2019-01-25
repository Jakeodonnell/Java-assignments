package laboration4;

import javax.swing.JOptionPane;

public class Program4a {
	public void heltal () {
	
		int num;
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("ange ett heltal"));
		
		if (num>99) {
			
			JOptionPane.showMessageDialog(null, "Talet är större än 100!!");
			}
		else {
			JOptionPane.showMessageDialog(null, "ditt tal är mindre än 100");
		}	
	}
	public static void main(String[] args) {
		Program4a p4a = new Program4a();
		p4a.heltal();
	}
}
