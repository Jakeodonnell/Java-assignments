package laboration8;

public class PointTest2 {
	public static void main(String[] args) {
		Point p1 = new Point( 11, 13 );
		Point p2 = p1.copy(); // Det nya Point-objektet ska ha tillståndet x=11 och y=13 (samma som p1) System.out.println( p1.toString() );
		System.out.println( p2.toString() );
	}

}
