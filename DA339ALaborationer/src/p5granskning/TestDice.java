
package p5granskning;

public class TestDice {

	private static Dice dice;

	/**
	 * @author Marcel Laska [30/11-17, P5] 
	 * Kastar tärningen ett X antal gånger
	 * @param dice = tärningen
	 * @param nbrOfThrows = antalet kast
	 */
	public static void test(Dice dice, int nbrOfThrows) {

		int score;
		// Skapar ny array dvs "räknare" - räknar alla 'scores'
		int[] res = new int[dice.getSides()];

		for (int i = 0; i < nbrOfThrows; i++) {
			score = dice.throwDice();
			res[score - 1]++;
		}

		TestSimpleDice.printResult(res);
		TextWindow.println();
	}

	/**
	 * Kastar tärningen ett X antal gånger men kollar om spelaren är en OrdinaryPlayer eller Cheater
	 * 
	 * @param player = spelaren
	 * @param nbrOfThrows = antalet kast
	 */
	public static void test(Player player, int nbrOfThrows) {

		Dice dice = null;
		int score;

		// kollar om player == OrdinaryPlayer
		if (player instanceof OrdinaryPlayer) {
			OrdinaryPlayer ordinaryPlayer = (OrdinaryPlayer) player;
			dice = ordinaryPlayer.getDice();

			// Kollar om player == Cheater
		} else if (player instanceof Cheater) {
			Cheater cheater = (Cheater) player;
			dice = cheater.getDice();

		}

		// Skapar ny array dvs "räknare" - räknar alla 'scores'
		int[] res = new int[dice.getSides()];

		for (int i = 0; i < nbrOfThrows; i++) {
			score = player.throwDice();
			res[score - 1]++;
		}
		TestSimpleDice.printResult(res);
		TextWindow.println();
	}

	public static void main(String[] args) {
		TestDice.test(new SimpleDice(6), 1000000);
		TextWindow.println();
		TestDice.test(new SimpleDice(4), 1000000);

	}

}
