package p2;

import javax.swing.JOptionPane;

public class Exercise2a {

	public void demo() {
		Painting p1 = new Painting("Mona Lisa", "Leonardo da Vinci", 1507); 
		Painting p2 = new Painting("Guernica", "Pablo Picasso", 1937);
		JOptionPane.showMessageDialog(null, p1.getTitle() +	" målad av den enastående konstnären " + p1.getPainter() + ", färdigställd " + p1.getYear());
		JOptionPane.showMessageDialog(null, p2.toString()); }

	public static void main(String[] args) {
		Exercise2a prog = new Exercise2a();
		prog.demo();
	}
}
