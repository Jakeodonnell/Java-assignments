package laboration3;
import javax.swing.ImageIcon; 
import javax.swing.JOptionPane;
public class Program3j {
	public void bild() {
		PaintWindow window = new PaintWindow();
		int x, y, indexcomma;
		String angx, angy, xyin; 

		ImageIcon image = new ImageIcon("images/summer.jpeg");
		window.showImage(image, 0, 0);

		xyin = JOptionPane.showInputDialog("Ange ny plats för bilden: x,y");
		indexcomma = xyin.indexOf(",");
		angx = xyin.substring(0, indexcomma);
		x = Integer.parseInt(angx);
		angy = xyin.substring(indexcomma+1);
		y = Integer.parseInt(angy);
		window.showImage(image, x, y);

	}
	public static void main(String[] args) {
		Program3j p3j = new Program3j();
		p3j.bild();
	}
}
