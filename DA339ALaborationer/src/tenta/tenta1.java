package tenta;

import javax.swing.JOptionPane;

public class tenta1 {
	public void tenta1() {
		String mening, deladsträng, meningutanvokal = "result \n";
		int index = 0, sum=0, valavtyp, vokaler;


		mening = JOptionPane.showInputDialog("Mata in en mening med små bokstäver endast") + ' ';

		valavtyp = Integer.parseInt(JOptionPane.showInputDialog("mening ska:" + "\n1. Visa possition för borttagna vokaler" + "\n2. Ej visa possition för borttagna vokaler"));
		
		if (valavtyp == 1) {
			
			for(int i = 0; i < mening.length(); i++) {
				if(mening.charAt(i) == 'a') {
					deladsträng = mening.substring(index, i);
					index = i +1;
					meningutanvokal += deladsträng + "_";
				}
				
			}
		
		}JOptionPane.showMessageDialog(null, meningutanvokal);

	} public static void main (String []args ) {
		tenta1 t1 = new tenta1();
		t1.tenta1();
	}
}
