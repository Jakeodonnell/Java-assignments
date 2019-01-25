package p5;

/**
 * This class checks if a player returns the right amount of points.
 * @author JakeODonnell
 *
 */

public class TestDice { 

	/**
	 * test stores the value of every possible dicevalue, ex res[ 0 ] stores every throw when the dicevalue is 1, 
	 * res[ 1 ] when the dicevalue is 2. The array length is decided by the dice size - 1, since it starts at 0.
	 * 
	 * The first for loop collects the ones, it will chech every throw diceded by "nbrofthrows" after its done it will print 
	 * the value and start over again till it reaches the end.
	 * 
	 * @param dice
	 * @param nbrOfThrows
	 */

	public static void test( Dice dice, int nbrOfThrows ) {
		int[] res = new int[ dice.getSides() ];

		for(int i = 0; i < nbrOfThrows; i ++) {
			dice.throwDice();
			res[ dice.throwDice() - 1] ++;
		}

		for( int i = 0; i < res.length; i ++) {
			TextWindow.println(i + 1 + "   " + res[i]);
		} 
	}


	/**
	 * test checks if the player is a cheater och an ordinaryplayer, this is done by "instance of", it checks if the object is an
	 * instance of a specific class. For each player it then uses its dice value and calculates each throws value, it calculates how many 1 to 6 
	 * has been thrown. The array is Used just like the previous one.
	 * @param player
	 * @param nbrOfThrows
	 */

	public static void test( Player player, int nbrOfThrows ) {

		int sides = 0; 
		if ( player instanceof OrdinaryPlayer) {
			player = (OrdinaryPlayer) player;
			Dice dice = ((OrdinaryPlayer)player).getDice();
			sides = dice.getSides();

		}
		else if ( player instanceof Cheater) {
			player = (Cheater) player;
			Dice dice = ((Cheater)player).getDice();
			sides = dice.getSides();
		}

		int[] res = new int[ sides ];
		for(int i = 0; i < nbrOfThrows; i ++) {
			res[ player.throwDice() - 1] ++;
		}

		for( int i = 0; i < res.length; i ++) {
			TextWindow.println(i + 1 + "   " + res[i]);
		}
	}


	public static void main(String[] args) {
		TestDice.test( new OrdinaryPlayer( "Rut", new SimpleDice( 6 ) ), 1000000 ); 
		TextWindow.println();
		TestDice.test( new Cheater( "Fuffe", new SimpleDice( 6 ) ), 1000000 );
	}
} 
