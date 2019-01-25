package laboration4;

import javax.swing.JOptionPane;

public class Program4h {
	public void Tbiggest() {

		int nbr1, nbr2, nbr3;

		nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett nummer"));
		nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Sktiv in ett till"));
		nbr3 = Integer.parseInt(JOptionPane.showInputDialog("Sktiv in ytterligare ett till"));
		if ( (nbr1 > nbr2) && (nbr1 > nbr3)) {

			JOptionPane.showMessageDialog(null, nbr1 + " är det största talet");
		}

		else if ((nbr2 > nbr1) && (nbr2 > nbr3)){

			JOptionPane.showMessageDialog(null, nbr2 + " är det största talet");

		}

		else {
			
			JOptionPane.showMessageDialog(null, nbr3 + " är det största talet");


		}

	}
	public static void main(String[] args) {
		Program4h p4h = new Program4h();
		p4h.Tbiggest();
	}
}


