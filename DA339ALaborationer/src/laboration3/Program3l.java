package laboration3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Program3l {
	public void movingMan() {
		PaintWindow window = new PaintWindow(); 
		int x,y, indexcomma;
		String cordi,angx,angy;
		
		ImageIcon image = new ImageIcon("images/summer.jpeg"); 
		window.showImage(image, 150, 150);
		cordi = JOptionPane.showInputDialog("Ange ny plats för bilden: x,y"); 
		indexcomma = cordi.indexOf(',');
		angx = cordi.substring(0,indexcomma);
		x = Math.max( Integer.parseInt(angx), 0);
		x = Math.min( x, 600-image.getIconWidth());
		angy = cordi.substring(indexcomma+1);
		y = Math.max( Integer.parseInt(angy), 0);
		y = Math.min( y, 400-image.getIconHeight()); 
		window.showImage(image, x, y);
		}
		public static void main(String[] args) { 
			Program3l prog = new Program3l(); 
			prog.movingMan();
		}
}
