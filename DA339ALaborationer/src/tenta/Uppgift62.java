package tenta;

import javax.swing.JOptionPane;

public class Uppgift62 {
	public void tenta2(){
		String mening, nystring, delbartmedfyra = "";
		int sum = 0, index = 0, delbarmed4string;
		
		mening = JOptionPane.showInputDialog("Mata in tal separerade med komma-tecken") + '.';
		
		for(int i =0; i<mening.length(); i++) {
			if(mening.charAt(i) == '.') {
				nystring = mening.substring(index, i);
				index = i + 1;
				delbarmed4string = Integer.parseInt(nystring);
				sum += delbarmed4string;
				
				if(sum %4 == 0) {
					
					delbartmedfyra += delbarmed4string + " ";
				}
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "talens summa: " + sum + "\nTal delbara med 4: " + delbartmedfyra);
	}
	public static void main (String [] args) {
		Uppgift62 up62 = new Uppgift62();
		up62.tenta2();
	}
}