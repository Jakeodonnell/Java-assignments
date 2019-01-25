/*
 * Lab1Exercise1.java
 * Skapad den 2 september 2014
 */
import javax.swing.JOptionPane;

/**
 * Programmet skriver ut "Ett java-program" med hjälp av ett dialogfönster.
 * 
 * @author Rolf axelsson
 * @version 1.0
 */
public class Lab1Exercise1 {

	/*
	 * Metoden visar texten "Ett java-program" i ett dialogfönster.
	 */
	public void message() {
		// Ett dialogfönster öppnas med meddelandet "Ett java-program".
		JOptionPane.showMessageDialog( null, "Ett java-program skrivet av mig" );
		JOptionPane.showMessageDialog( null, "När du klickar på OK avslutas programmet");
	}

	/*
	 * Instruktionerna i main-metoden utförs då programmet exekveras.
	 * main-metoden har endast två instruktioner.
	 * - den första instruktionen skapar ett objekt av typen Lab2Exercise1
	 * - den andra instruktionen anropar metoden message i det nyss skapade objektet
	 */
	public static void main( String[] args ) {
		Lab1Exercise1 prog = new Lab1Exercise1();
		prog.message();
	}
}
