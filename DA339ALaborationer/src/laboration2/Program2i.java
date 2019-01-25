package laboration2;

import javax.swing.JOptionPane;

public class Program2i {

	public void info () {

		String namn;
		int num1, num2;

		namn = JOptionPane.showInputDialog("Ange ditt namn");
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ange din ålder du fyller i år"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ange nuvarande år"));

		JOptionPane.showMessageDialog(null, (namn) + ", år " + ( num2 - num1 + 100) + " fyller du 100 år!");

	}

	public static void main(String [] args) {

		Program2i p2i = new Program2i();
		p2i.info();

	}

}
