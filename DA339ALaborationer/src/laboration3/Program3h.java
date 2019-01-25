package laboration3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Program3h {
	public void bild() {
		int num1, num2;
		
		PaintWindow window = new PaintWindow();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		window.showImage(image, 0, 0);
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ange X-kordinater"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ange Y-kordinater"));
		window.showImage(image, num1, num2);
		
	}
	
	public static void main (String[] args) {
		
		Program3h p3h = new Program3h();
				p3h.bild();
		
	}
}
