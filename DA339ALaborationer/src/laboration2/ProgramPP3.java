package laboration2;

import javax.swing.JOptionPane;

public class ProgramPP3 {

	public static void main (String[] args) {

		double num1, num2;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Mata in ett tal"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Ett till..."));

		JOptionPane.showMessageDialog( null, (" Summa " + (num1 + num2)) + ( " \n Difference " + (num1 - num2 )) + (" \n Produkt " + num1 * num2));

	}
}
