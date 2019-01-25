package laboration7;
import javax.swing.JOptionPane;

public class Input {
	public static int getInt( String message ) {
		int res = Integer.MIN_VALUE;
		String str = JOptionPane.showInputDialog( message );
		if(str!=null && str.length()>0) {  // användaren klickade inte på Avbryt 
			res = Integer.parseInt( str ); // och minst ett tecken i inmatningen
		}

		return res;
	}

	public static long getLong( String message ) {
		long res = Long.MIN_VALUE;
		String str = JOptionPane.showInputDialog(message);
		if( str!=null && str.length()>0) {
			res = Long.parseLong(str);
		}

		return res;
	}

	public static double getDouble ( String message) {
		double res = Double.NaN;
		String str = JOptionPane.showInputDialog(message);
		if(str!=null && str.length()>0) {
			res = Double.parseDouble(str);
		}
		
		return res;
	}
}
