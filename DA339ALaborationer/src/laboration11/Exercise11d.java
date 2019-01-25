package laboration11;

public class Exercise11d {

	public void reverse (int [] numbers) {

		String res = "";
		for (int i = numbers.length -1 ; i >= 0; i --) {

			res += (numbers [i] + " ");
		}
		System.out.println(res);
	}

	public static void main(String [] args) {
		Exercise11d e11d = new Exercise11d(); 
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1000, 100, 10, 1 }; 
		System.out.print( "Array 1 baklänges: " ); 
		e11d.reverse( arr1 ); 
		System.out.println();
		System.out.print( "Array 2 baklänges: " ); 
		e11d.reverse( arr2 ); 
		System.out.println();
	}
}
