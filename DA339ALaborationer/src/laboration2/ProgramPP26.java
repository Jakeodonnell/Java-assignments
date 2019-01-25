package laboration2;



import javax.swing.JOptionPane;

public class ProgramPP26 {

	public static void main (String [] args) {
	
	
	final int Seconds_per_hour = 3600;
	final int Seconds_per_minute = 60;
	int hours, minutes, seconds, totalseconds;
	
	
	hours = Integer.parseInt(JOptionPane.showInputDialog("Enter hours"));
	minutes = Integer.parseInt(JOptionPane.showInputDialog("Enter minuts"));
	seconds = Integer.parseInt(JOptionPane.showInputDialog("Enter seconds"));

	
	totalseconds = Seconds_per_hour * hours +
				   Seconds_per_minute * minutes +
				   seconds;
	JOptionPane.showMessageDialog(null, "Total seconds: " + totalseconds);
	
	
	}

}
