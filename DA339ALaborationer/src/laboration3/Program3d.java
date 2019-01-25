package laboration3;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Program3d {
	public void timedate() {
		
		Calendar cal = Calendar.getInstance();
		int dayOfMonth, month, year, hourOfDay, minute, seconds;
		String res;
		
		dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		month = cal.get(Calendar.MONTH);
		year = cal.get(Calendar.YEAR);
		hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		seconds = cal.get(Calendar.SECOND);
		
		res = 	"Dagens datum: " + dayOfMonth + "/" + month + "-" + year + "\n" + 
				"Klockan är: " + hourOfDay + ":" + minute + ":" + seconds;	
		JOptionPane.showMessageDialog(null, res);
	}
	
	public static void main (String [] args) {
		Program3d p3d = new Program3d();
				p3d.timedate();
		
	}
}
