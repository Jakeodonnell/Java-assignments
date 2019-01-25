

package p5granskning;

import java.util.Random;

/**
 * @author Marcel Laska [30/11-17, P5]
 * SimpleDice - tärning som har åtminstone 1 sida
 *
 */
public class SimpleDice implements Dice {

	private int sides;
	private Random rand;

	/**
	 * En tärning tilldelas 6st sidor
	 */
	public SimpleDice() {
		this.sides = 6; 
	}

	/**
	 * En tärning får instantieras till angivna värden
	 * @param howManySides hur många sidor tärningen har
	 * @throws NegativeSidesException om sidor på tärningen är mindre elr lika med 0
	 */
	public SimpleDice(int howManySides) throws NegativeSidesException {

		if (howManySides <= 0) {
			throw new NegativeSidesException("ERROR! - Tärningen måste ha MINST en sida! " + howManySides);

		} else {
 
			sides = howManySides;
		} 

	}

	/**
	 * Slumpar fram tärningens tal/poäng
	 * @return tärningens slumpade tal/poäng
	 */
	public int throwDice() {
		rand = new Random();
		return (rand.nextInt(sides) + 1);
	}

	/**
	 * @return hur många sidor tärningen har
	 */
	public int getSides() {
		return sides;
	}

}
