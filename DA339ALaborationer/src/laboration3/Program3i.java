package laboration3;

import javax.swing.JOptionPane;

public class Program3i {
	public void namn() {
		
		int index;
		String name, firstname, surrname, res, initials;
		
		
		name = JOptionPane.showInputDialog("Mata in förnamn och efternamn");
		index = name.indexOf(' ');
		firstname = name.substring(0, index);
		surrname = name.substring(index + 1);
		initials = String.valueOf(name.charAt(0));
		initials += String.valueOf(name.charAt(index + 1));
		
		
		
		res = "Ditt namn är: " + name + "\n" + 
		"Ditt förnamn är: " + firstname + "\n" +
		"Ditt efternamn är: " + surrname + "\n" +
		"Dina initialer är: " + initials;
		
		JOptionPane.showMessageDialog(null, res);
		
	}
	
	public static void main(String[] args) {
		Program3i p3i = new Program3i();
				p3i.namn();
	}
}
