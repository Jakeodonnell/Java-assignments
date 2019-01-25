package laboration2;

import javax.swing.JOptionPane;

public class Multiplikation {
	public void info() {

		double nbr1, nbr2;
		int input = JOptionPane.showOptionDialog(null, "multiplikations maskin, ange två tal", null, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);


		nbr1 = Double.parseDouble(JOptionPane.showInputDialog("multiplikation siffra ett"));
		nbr2 = Double.parseDouble(JOptionPane.showInputDialog("multiplikation siffra två"));

		JOptionPane.showMessageDialog(null, nbr1 * nbr2);
		if (input == JOptionPane.OK_OPTION)
		{
			Multiplikation mul = new Multiplikation();

			mul.info();

		}
	}

	public static void main (String [] args) {

		Multiplikation mul = new Multiplikation();

		mul.info();

	}


}


