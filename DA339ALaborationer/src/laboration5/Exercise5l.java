package laboration5;

import javax.swing.JOptionPane;

public class Exercise5l { 
	public void program() {
		int min, max, summa=0;
		
		min = Integer.parseInt(JOptionPane.showInputDialog("ange undre gräns:"));
		max = Integer.parseInt(JOptionPane.showInputDialog("ange övre gräns:"));
		
		String message = "Interval: [" + min + "," + max + "]" + "\ntal i intervallet:";
		
		for(int i = min ; i<=max ; i++) {
			message += i + " ";
			summa += i;
		}
		
		message += "\nSumman av dinna tal:" + summa;
		JOptionPane.showMessageDialog(null, message);
		
	}
	public static void main(String[] args) {
		Exercise5l u5l = new Exercise5l();
		u5l.program();
	}

} 