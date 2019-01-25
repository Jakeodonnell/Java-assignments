package p5;

/**
 * OrdinaryPlayer is a subclass och Player. And has no extraordinary rules such as cheater.
 * @author JakeODonnell
 *
 */
public class OrdinaryPlayer extends Player{
	
	private Dice dice;
	
	/**
	 * This constructor uses a constructor with the parameter "name" given in the superclass Player.
	 * It also creates a dice with six sides.
	 * @param name
	 */
	
	public OrdinaryPlayer(String name) {
		super(name);
		this.dice = new SimpleDice(6); 
	}
	
	/**
	 * This constructor uses a constructor with the parameter "name" given in the superclass player.
	 * Dice also becomes a reference to this objects dice.
	 * @param name
	 * @param dice
	 */
	
	public OrdinaryPlayer(String name, Dice dice) { 
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
	 * This method returns the value of throwDice found in the class dice.
	 */
	
	public int throwDice() {
		return dice.throwDice();
	}
}
 