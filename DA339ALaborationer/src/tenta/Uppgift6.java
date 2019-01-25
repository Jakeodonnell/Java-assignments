package tenta;

import javax.swing.JOptionPane;

public class Uppgift6 {
	public void nummer() {
		
		String angivnanummer, resultat = "RESULTAT", deladsträng;
		int sum = 0, index = 0;
		
		angivnanummer = JOptionPane.showInputDialog("Ange en sträng med nummer") + " ";
		
		for(int i=0; i< angivnanummer.length(); i+=1) {
			if(angivnanummer.charAt(i) == ' ') {
				deladsträng = angivnanummer.substring(index, i);
				index = i + 1;
				sum += Integer.parseInt(deladsträng);
				resultat += "\n" + deladsträng;
			}	
		}
		resultat += "\n Summa: " + sum;
		JOptionPane.showMessageDialog(null, resultat);
	}
	public static void main (String [] args) {
		Uppgift6 up6 = new Uppgift6();
		up6.nummer();
		
	}
}


	