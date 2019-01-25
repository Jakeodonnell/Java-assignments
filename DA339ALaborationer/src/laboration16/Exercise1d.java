package laboration16; 
import resources.InOut;
public class Exercise1d {
	public static void main( String[] args ) {
		InOut io = new InOut();
		double nbr = io.readDouble( "Mata in ett Decimaltal mindre än 10.0" ); 
		System.out.println( "Inmatat tal: " + nbr );
	}
}