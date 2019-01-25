package laboration5;

import javax.swing.JOptionPane;

public class Exercise5i {
	public void name() {

		String name;

		name = JOptionPane.showInputDialog("Skriv in ditt namn");
		int nbrOfChars = name.length();
		for(int i=0 ; i<nbrOfChars ; i++) {

			System.out.println(name.charAt(i));

		}
	}

	public static void main(String[] args) {
		Exercise5i e5i = new Exercise5i();
		e5i.name();

	}

}
