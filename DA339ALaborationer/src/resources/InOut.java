package resources;

import javax.swing.JOptionPane;

public class InOut {

	public static int readInt() {
		int value = 0;
		boolean inputOK = false; do {
			try {
				value = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal")); inputOK = true;
			}
			catch( NumberFormatException ex ) {}
		} while( inputOK == false );
		return value;
	}

	public static int readInt ( String txt ) {
		int value = 0;
		boolean inputOK = false; do {
			try {
				value = Integer.parseInt(JOptionPane.showInputDialog(txt)); 
				inputOK = true;
			}
			catch( NumberFormatException ex ) {}
		} while( inputOK == false );
		return value;
	}

	public static double readDouble ( String txt ) {
		double value = 0;
		boolean inputOK = false; do {
			try {
				value = Double.parseDouble(JOptionPane.showInputDialog(txt)); 
				inputOK = true;
			}
			catch( NumberFormatException ex ) {}
		} while( inputOK == false );
		return value;
	}
	
	public static double readDouble() {
		double value = 0;
		boolean inputOK = false; do {
			try {
				value = Double.parseDouble(JOptionPane.showInputDialog("Mata in ett decimaltal mindre än 10.0")); 
				inputOK = true;
			}
			catch( NumberFormatException ex ) {}
		} while( inputOK == false );
		return value;
	}
	
	

}
