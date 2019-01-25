
package p5granskning;


/**
 * @author Marcel Laska [30/11-17, P5]
 * klassen OrdinaryPlayer visar en spelare med tärning
 * OrdinaryPlayer ärver klassen Player
 */
public class OrdinaryPlayer extends Player {

	private String name;
	private Dice dice;

	/**
	 * Konstruerar en spelare med namn & tärning med 6st sidor
	 * @param name = spelarens namn
	 */
	public OrdinaryPlayer(String name) {
		super(name); 
		this.dice = new SimpleDice(6); 
	}

	/**
	 * Konstruerar spelare med redan tillsatta värden
	 * @param name = spelarens namn
	 * @param dice = tärningen
	 */
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}

	/**
	 * Ger spelaren en tärning/sätter dice
	 * @param dice = törning
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * Returnerar tärningen
	 * @return dice
	 */
	public Dice getDice() {
		return this.dice;
	}

	/**
	 * kastar tärningen
	 * @return värdet som tärningen visade
	 */
	public int throwDice() {
		return dice.throwDice();
	}

}
