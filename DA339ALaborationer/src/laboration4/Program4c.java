package laboration4;

import javax.swing.JOptionPane;

public class Program4c {
	public void alder() {
		int age;
		
		age = Integer.parseInt(JOptionPane.showInputDialog("hur gammal är du?"));
		
		if (age< 18) {
			
			JOptionPane.showMessageDialog(null, "du är ett barn");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Du är vuxen");
		}
	}
	
	public static void main(String[] args) {
		Program4c p4c = new Program4c();
		p4c.alder();
	}

}
