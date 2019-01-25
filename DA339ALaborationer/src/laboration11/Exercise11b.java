package laboration11;

public class Exercise11b {
	public void greaterThan8( double[] array ) {

		int counter = 0;
		for (int i= 0; i < array.length; i++) {
			if (array [i] > 8) {
				System.out.print( array [i] + " " );
				counter += 1;
			}
		}

	}
	public void negativeNumbers( double[] array ) {

		String res = "";
		for (int i= 0; i < array.length; i++) {
			if (array [i] < 0) {
				res += ( array [i] + " " );
			}
		}
		
		System.out.println("\n" + res);
	}
	
	public void reverse( double[] array ) {
		
		String res = "";
		for (int i = array.length -1 ; i > 0; i--) {
			
				res += ( array [i] + " " );
		}
		
		System.out.println("Talen baklänges: " + res);
	}
	public void everyThirdReverse( double[] array ) {
		String res = "";
		for (int i = array.length -1 ; i > 0; i = i - 3) {
			
				res += ( array [i] + " " );
		}
		
		System.out.println("Talen baklänges: " + res);
	}
	public void action() {
		double[] numbers={ 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };

		//double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4 };

		greaterThan8(numbers); 
		negativeNumbers(numbers); 
		reverse(numbers); 
		everyThirdReverse(numbers);
	}
	public static void main( String[] args ) { 
		Exercise11b e11b = new Exercise11b(); 
		e11b.action();
	}
}


