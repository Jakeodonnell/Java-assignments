package p3;

import java.util.Random;

public class SSPPlayer {

	public int newChoise() {							//metoden anger datorspelarens val som en random variabel mellan 1-3 och returnar den
		Random rand = new Random();
		int computerchoise =  rand.nextInt(3)+1;

		return computerchoise;
	} 
}
