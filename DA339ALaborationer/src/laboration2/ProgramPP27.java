package laboration2;

import javax.swing.JOptionPane;

public class ProgramPP27 {

	public static void main (String [] args) {

		final int seconds_per_hour = 3600;
		final int seconds_per_minute = 60;
		int min, hour, sec;

		sec = Integer.parseInt(JOptionPane.showInputDialog("enter ammount of seconds"));

		hour = sec / seconds_per_hour;

		sec = sec % seconds_per_hour;  // remaining seconds

		min = sec / seconds_per_minute;

		sec = sec % seconds_per_minute;


		JOptionPane.showMessageDialog(null,"h: " + hour + " min: " + min + " sec: " + sec);


	}


} 
