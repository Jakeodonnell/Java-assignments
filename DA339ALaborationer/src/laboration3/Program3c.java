package laboration3;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Program3c {

	public void time() {

		int hourOfDay, minute, seconds;
		String res;

		Calendar cal = Calendar.getInstance();

		hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		seconds = cal.get(Calendar.SECOND);

		res = "Klockan är: " + hourOfDay + ":" + minute + ":" + seconds;
		JOptionPane.showMessageDialog(null, res);
	}
	public static void main (String [] args) {

		Program3c p3c = new Program3c();
		p3c.time();

	}

}