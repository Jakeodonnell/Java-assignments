package laboration4;

import javax.swing.JOptionPane;

public class Program4d {
	public void namn() {

		String name;
		name = JOptionPane.showInputDialog("Ange ditt namn");

		if (name.length()<= 5) {

			JOptionPane.showMessageDialog(null, name + ", ditt namn är kort och fint!");

		}

		else {
			JOptionPane.showMessageDialog(null, name + ", ditt namn är långt, fult och svårstavat");
		}

	}

	public static void main(String[] args) {
		Program4d p4d = new Program4d();
		p4d.namn();
	}
}
