package laboration5;
import javax.swing.ImageIcon;
import laboration3.PaintWindow;
/**
 * Flytta bild i ett PaintWindow-fönster
 * @author tsroax
 */
public class Exercise5e {

	public void leftRight() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon("images/gubbe.jpg");
		for(int x=0; x<=500; x+=5) {
			window.showImage(man, x, 150);
			PaintWindow.pause(50);
		}
	}

	public void rightLeft() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon ("images/gubbe.jpg");
		for (int x=500; x>=0; x-=5) {
			window.showImage(man, x, 150);
			PaintWindow.pause(50);
		}

	}

	public void upDown() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon ("images/gubbe.jpg");
		for (int y=0; y<=300; y+=5) {
			window.showImage(man, 250, y);
			PaintWindow.pause(50);
		}
	}

	public void downUp() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon ("images/gubbe.jpg");
		for (int y=300; y>=0; y-=5) {
			window.showImage(man, 250, y);
			PaintWindow.pause(50);
		}
	}

	public static void main(String[] args) {
		Exercise5e e5e = new Exercise5e();
		e5e.leftRight();
		e5e.rightLeft();
		e5e.upDown();
		e5e.downUp();
	}
}
