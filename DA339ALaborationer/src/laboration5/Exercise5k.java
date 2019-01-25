package laboration5;

import java.util.Random;

public class Exercise5k {
	public void tärning() {
		Random rand = new Random();
		int kast, antkast = 0;
		
		
		kast = rand.nextInt(6)+1;
		while ( kast != 1) {
			antkast = + 1;
			System.out.print(kast + " ");
			kast = rand.nextInt(6)+1;
		}
		
		System.out.println("\nAntal kast utan etta: " + antkast);
	}
	
	public static void main(String[] args) {
		Exercise5k e5k = new Exercise5k();
		e5k.tärning();
	}

}
