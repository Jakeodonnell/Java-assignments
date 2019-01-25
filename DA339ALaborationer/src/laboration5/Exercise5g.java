package laboration5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercise5g {

	public void exer5g() {
		int number, randomValue, sum = 0;
		Random rand = new Random();
		number = Integer.parseInt( JOptionPane.showInputDialog( "Antal slumptal" ) ); 
		System.out.println( "Slumptal: " );
		for( int i = 1 ; i <= number ; i++ ) {
			randomValue = rand.nextInt(20) + 5;
			System.out.print( randomValue + " " );
			sum +=randomValue;
			}
		System.out.println("\nsumman : \n" + sum);
	}

	public static void main(String[] args) {
		Exercise5g e5g = new Exercise5g();
		e5g.exer5g();
	}
}
