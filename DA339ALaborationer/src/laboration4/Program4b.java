package laboration4;

import javax.swing.JOptionPane;

public class Program4b {
		public void heltal2 () {
		
			int num;
			
			
			num = Integer.parseInt(JOptionPane.showInputDialog("ange ett heltal"));
			
			if (num>100) {
				
				JOptionPane.showMessageDialog(null, "Talet är större än 100!!");
				}
			else {
				JOptionPane.showMessageDialog(null, "ditt tal är högst 100 ");
			}	
		}
		
		public static void main(String[] args) {
			Program4b p4b = new Program4b();
			p4b.heltal2();
		}
	}

