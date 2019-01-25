package tenta;

import javax.swing.JOptionPane;

public class Tenta5f {
	public void test() {
		String menu = "ALTERNATIV\n\n1. Addera\n2. Subtrahera\n3. Avbryt";
		int choice, nbr1, nbr2;

		choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		if (choice <1 || choice > 3) {
			choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
		
		else if (choice == 1) {
			nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Ange första talet att addera"));
			nbr2 = Integer.parseInt(JOptionPane.showInputDialog("ange andra talet att addera"));
			JOptionPane.showMessageDialog(null, "Svar: " + (nbr1 + nbr2));
		}
		
		else if (choice == 2) {
			nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Ange första talet att addera"));
			nbr2 = Integer.parseInt(JOptionPane.showInputDialog("ange andra talet att addera"));
			JOptionPane.showMessageDialog(null, "Svar: " + (nbr1 - nbr2));
		}
	}
	
	public static void main (String [] args){
		Tenta5f t5f = new Tenta5f();
		t5f.test();
	}
}
