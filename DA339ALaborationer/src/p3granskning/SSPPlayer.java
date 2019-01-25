package p3granskning;

import java.util.Random;
/**
 * SSPPlayer representerar datorn och utför valet av vapen.
 * @author eriklundow
 *
 */
public class SSPPlayer {

	private Random rand=new Random();

	//Getmetoden newChoice() returnerar ett värde mellan 0-2.
	public int newChoice() {
		
		int choice = rand.nextInt(3);
		
		return choice ;
		
	}
}
