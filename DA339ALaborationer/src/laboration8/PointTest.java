package laboration8;

public class PointTest {
	public static void main(String[] args) {

		Point p1 = new Point( 10, 12 ); 
		Point p2 = new Point( p1 ); 
		System.out.println( p1.toString() );
		System.out.println( p2.toString() );
	}
}
