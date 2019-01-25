package laboration11;

public class Uppgift11a {

	public void action() {
		double[] numbers = { 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };
		//double [] numbers = {-1,2,5,8,11,14,10,6,2,-4};
		int counter = 0; 
		double sum = 0; 
		String res = "";

		for (int i= 0; i < numbers.length; i++) {
			if (numbers [i] < 10) {
				System.out.print( numbers [i] + " " );
				counter += 1;
				sum = sum + numbers [i];
			}
		}

		System.out.println(" , antal = " + counter);
		for (int i= 0; i < numbers.length; i++) {
			if (numbers [i] < 10) {
				System.out.print( numbers [i] + " " );
				counter += 1;
				sum = sum + numbers [i];
			}
		}


		System.out.println(" Antal element = " + numbers.length);

		sum = 0;
		for (int i= 0; i < numbers.length; i++) {

			System.out.print( numbers [i] + " ");
			sum = sum + numbers [i];

		}

		System.out.println(" Talens summa är " + sum);

		for (int i= 0; i < numbers.length; i++) {
			if (numbers [i] > 8) {
				System.out.print( numbers [i] + " " );
				counter += 1;
			}
		}

		counter = 0;
		for (int i= 0; i < numbers.length; i++) {
			if (numbers [i] > 8) {

				counter += 1;
			}
		}

		System.out.println("\nAntal Tal som är större än 8: " + counter);

		for (int i= 0; i < numbers.length; i++) {
			if (numbers [i] < 0) {
				System.out.print( numbers [i] + " " );
			}
		}

		sum = 0;
		for (int i= 0; i < numbers.length; i++) {
			if (numbers [i] < 0) {

				sum = (sum + numbers [i]);
			}
		}

		System.out.println("\nSumma av de negativa talen är: " + sum);


		for (int i = numbers.length -1; i >= 0; i--) {

			res += (numbers [i] + " ");

		}

		System.out.println("Talen baklänges: " + res);

		res = "";
		for (int i = numbers.length -1; i >= 0; i = i - 3) {

			res += (numbers [i] + " ");

		}

		System.out.println("Vart 3:e tal baklänges: " + res);

		res = "";
		for (double nbr : numbers) {

			res += nbr + " ";
		}

		System.out.println(res);

		counter = 0;
		for (double nbr : numbers) {

			if ( nbr > 8) {

				counter ++;
			}
		}

		System.out.println("Antal tal större än 8: " + counter);
	}

	public static void main( String[] args ) { 
		Uppgift11a e11a = new Uppgift11a(); 
		e11a.action();
	}

}
