package p5;

import java.util.Random;

/**
 * Cheater is a subclass to player, cheater will make one extra ponit every other throw.
 * @author JakeODonnell
 *
 */

public class Cheater extends Player{
	private Dice dice;
	Random rand = new Random();
	  
	/**
	 * This constructor uses a constructor with the parameter "name" given in the superclass Player.
	 * It also creates a dice with six sides.
	 * @param name
	 */

	public Cheater(String name) {
		super(name);
		this.dice = new SimpleDice(6);
	}
	
	/**
	 * This constructor uses a constructor with the parameter "name" given in the superclass player.
	 * dice also becomes a reference to this objects dice.
	 * @param name
	 * @param dice
	 */

	public Cheater(String name, Dice dice) {
		super(name);
		this.dice = dice;

	}

	/**
	 * This method sets the dice value.
	 * @param dice
	 */
	
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * This method retuns the dice value
	 * @return dice
	 */
	
	public Dice getDice() {
		return dice;
	}

	/**
	 * This metod throws the dice and depending on if the return value of dice.throwdice is the max value of that dice
	 * it will or will not continue to the next if-statement.
	 * If the value recived by cheater is not the max value it will depending on a random true/false statement add an additional
	 * point to the dice. This should happen every one of two times.
	 * 
	 * @return res
	 */
	
	public int throwDice() {

		int res = dice.throwDice();{
			if (res != dice.getSides()) {
				if(rand.nextBoolean()) {
					res++;
				}
			}
			return res;
		}
	}
}
