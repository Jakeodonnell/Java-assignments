package laboration4;

import javax.swing.JOptionPane;

public class Program4i {
	public void skott() {
		int årtal;

		årtal = Integer.parseInt(JOptionPane.showInputDialog("Ange årtal du undrar är ett skottår."));

		if (årtal < 1582) {

			JOptionPane.showMessageDialog(null, "Året är före den gregorianska kalendern");

		}

		else {
			if (årtal % 4 == 0) {
				if((årtal % 100 == 0) && (årtal % 400 == 0)){

					JOptionPane.showMessageDialog(null, "Året är inte ett skottår");

				} else { 

					JOptionPane.showMessageDialog(null, "Det är ett skottår");
				}

			} else {
				JOptionPane.showMessageDialog(null, "Det är inte ett skottår");
			}
		}
	}


	public static void main(String[] args) {
		Program4i p4i = new Program4i();
		p4i.skott();
	}

}
