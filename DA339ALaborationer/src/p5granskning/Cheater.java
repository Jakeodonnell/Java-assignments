/**
 * @author Marcel Laska
 *         30/11-17
 *            P5
 */

package p5granskning;

import java.util.Random;

public class Cheater extends Player {

	private Dice dice;
	private Random rand = new Random();

	public Cheater(String name) {
		super(name);
		this.dice = new SimpleDice(6);
	}

	public Cheater(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}

	public Dice getDice() {
		return this.dice;
	}

	public int throwDice() {
		int ordinaryDice = dice.throwDice();
		int cheaterDice = ordinaryDice + 1;

		if (ordinaryDice == dice.getSides()) { // maxvärde på kastet?
			return ordinaryDice;
		} else {
			if (rand.nextInt(2) == 1) { // fuska ca varannan gång
				return cheaterDice;
			} else
				return ordinaryDice;
		}

	}

}
