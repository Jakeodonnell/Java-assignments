package laboration3;

import javax.swing.JOptionPane;

public class Program3a {
	
	 public void nameInfo1() {
	        String name, upperCase, lowerCase, res="";
	        int count;
	        char firstLetter;

	        name = JOptionPane.showInputDialog("Mata in ditt förnamn");
	        count = name.length();  // length() => antal tecken i String-objektet
	        upperCase = name.toUpperCase();  // toUpperCase => nytt String-objekt
	        lowerCase = name.toLowerCase();  // toLowerCase => nytt String-objekt
	        firstLetter = name.charAt(0);  // charAt(index) => returnerar tecken i visst index

	        res += "Du heter " + name + "\n" + 
	        "Ditt namn innehåller " + count + " bokstäver" + "\n" + 
	        	"Ditt namn med stora bokstäver " + upperCase + " \n" + 
	        "Ditt namn med små bokstäver " + lowerCase + "\n" + 
	        	"Första bokstaven i ditt namn är " + firstLetter;
	        
	        
	        
	        JOptionPane.showMessageDialog(null, res);
	    }

	    public static void main(String[] args) {
	        Program3a p3a = new Program3a();
	        p3a.nameInfo1();
	    }

}
