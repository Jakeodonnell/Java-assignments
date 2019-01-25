package laboration2;

import javax.swing.JOptionPane;

public class ProgramPP2 {

	public void info() {

		double nbr1, nbr2, nbr3;


		nbr1 = Double.parseDouble(JOptionPane.showInputDialog("ange första siffran till beräkning av medelvärdet"));
		nbr2 = Double.parseDouble(JOptionPane.showInputDialog("ange andra siffran till beräkning av medelvärdet"));
		nbr3 = Double.parseDouble(JOptionPane.showInputDialog("ange tredje siffran till beräkning av medelvärdet"));

		JOptionPane.showMessageDialog ( null, (nbr1 + nbr2 + nbr3) / 3);


	}

	public static void main (String [] args) {

		ProgramPP2 med = new ProgramPP2 ();

		med.info();

	}


}
