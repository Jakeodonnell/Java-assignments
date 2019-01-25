package laboration5;

/**
 * 3 metoder med samma mening
 * @author Rolf Axelsson
 */
public class Exercise5d {
	public void forloop() {
		int min = 10, max = 25, increase = 3;
		for(int i = min ; i <= max; i += increase ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}

	public void whileloop() {
		int min = 10, max = 25, increase = 3;
		int i = min;
		while ( i <= max) {
			System.out.print(i + " ");
			i += increase;
		}
		System.out.println();

	}

	public void doloop() {
		int min = 10, max = 25, increase = 3;
		int i = min;
		do {
			System.out.print( i + " ");
			i += increase;	
		} while (i <= max);
	}

	public static void main(String[] args) {
		Exercise5d e5d = new Exercise5d();
		e5d.forloop();
		e5d.whileloop();
		e5d.doloop();
	}
}
