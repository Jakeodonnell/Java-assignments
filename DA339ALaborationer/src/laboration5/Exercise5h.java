package laboration5;

import javax.swing.JOptionPane;



public class Exercise5h {

	public void skott() {
		int årtal;

		årtal = Integer.parseInt(JOptionPane.showInputDialog("Ange årtal du undrar är ett skottår."));
		while (årtal >=0) {
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

			årtal = Integer.parseInt(JOptionPane.showInputDialog("Ange nuvarande år, negativt år för avbrott"));
		}

	}


	public static void main(String[] args) {
		Exercise5h p5h = new Exercise5h();
		p5h.skott();
	}

}