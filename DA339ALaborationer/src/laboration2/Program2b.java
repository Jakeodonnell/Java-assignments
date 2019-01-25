package laboration2;

import javax.swing.JOptionPane;

public class Program2b {

	public void info() {
		String name;																									// Definierar variabel
		int nbr;																										// Definierar variabel

		name = JOptionPane.showInputDialog("Ange ditt namn");															//dialogrutan skapas och är definierad med en variabel så vi vet vad som är vad
		nbr = Integer.parseInt(JOptionPane.showInputDialog("Ange antal Java-progra som du har skrivit"));				//dialogrutan skapas och är definierad med en variabel så vi vet vad som är vad

		// Lägg till instruktioner här
		System.out.println ("Hej, mitt namn är" + name);
		System.out.println ("Jag har skrivit " + nbr + " program i Java");
		JOptionPane.showMessageDialog(null, 
				"Hej, mitt namn är " + name + 
				".\nJag har skrivit " + nbr + 
				" program i Java. " + 
				"\nDet är KUL med Java!!!");

	}

	public static void main( String[] args ) {

		Program2b p2 = new Program2b();		
		p2.info();
	}
}