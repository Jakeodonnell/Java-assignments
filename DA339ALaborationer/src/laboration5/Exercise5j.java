package laboration5;

import java.awt.Color;
import java.util.Random;

import laboration3.PaintWindow;

public class Exercise5j { 
	public void randomLines() {
		int x1, y1, x2, y2, lineWidth,nbroflines, maxX, maxY;
		Color color;
		
		Random rand = new Random();
		PaintWindow window = new PaintWindow();
		
		maxY = window.getHeight();
		maxX = window.getWidth();
		
		window.fillRect(0, 0, maxX, maxY, Color.BLACK);
		
		nbroflines = rand.nextInt(16)+4;
		for (int i = 0; i<nbroflines; i++) {
			
			x1 = rand.nextInt(maxX);
			x2 = rand.nextInt(maxX);
			y1 = rand.nextInt(maxY);
			y2 = rand.nextInt(maxY);
			color = new Color (rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			lineWidth = rand.nextInt(17)+4;
			window.line(x1, y1, x2, y2, color, lineWidth);
		
		}
	}
	public static void main(String[] args) {
		Exercise5j e5j = new Exercise5j();
		e5j.randomLines();
	}
}