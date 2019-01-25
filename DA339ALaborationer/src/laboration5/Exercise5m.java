package laboration5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercise5m {

	public void numbers() {
		int sum=0, nbr, randomvalue;
		Random rand = new Random();
		nbr = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett värde mellan 10-20"));
		
		System.out.print("Inmatning\n" + nbr);
	
		if ((nbr>= 10) && (nbr<=20)) {
			System.out.println("\nTänkbart resultat\n" + sum);
			do {
				randomvalue = rand.nextInt(6)+ 1;
				System.out.print(randomvalue + " ");
				sum += randomvalue;
				
				
			} while(sum<nbr);
			
		}else {
			
			nbr = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett värde mellan 10-20"));
			
		}
		

	}
	public static void main(String[] args) {
		Exercise5m e5m = new Exercise5m();
				e5m.numbers();	
	}
}