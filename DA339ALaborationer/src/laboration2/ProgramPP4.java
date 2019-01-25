package laboration2;

import javax.swing.JOptionPane;

public class ProgramPP4 {

	public void info() {

		double num1;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Ange Grader i C för kovertion till F"));

		JOptionPane.showMessageDialog(null, num1 * 9/5 + 32);

	}

	public static void main (String [] args) {

		ProgramPP4 con = new ProgramPP4();
		con.info();


	}

}
