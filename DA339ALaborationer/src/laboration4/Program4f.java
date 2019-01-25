package laboration4;

import javax.swing.JOptionPane;

public class Program4f {
	public void biggest() {

		int nbr1, nbr2;

		nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett nummer"));
		nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Sktiv in ett till"));

		if ( nbr1 > nbr2) {

			JOptionPane.showMessageDialog(null, nbr1 + " är det största talet");
		}

		else {

			JOptionPane.showMessageDialog(null, nbr2 + " är det största talet");

		}

	}
	public static void main(String[] args) {
		Program4f p4f = new Program4f();
		p4f.biggest();
	}
}
