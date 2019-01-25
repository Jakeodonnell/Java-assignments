package laboration14;

import java.awt.Color;

public class NSides extends Shape{

	private Point[] points;
	public NSides(int x, int y, Point[] points, Color color) { super(x, y, color);
	this.points = points;
	}
	public void paint(PaintWindow window) { 

		int x1, y1, x2, y2;

		if (points.length >= 2) {

			for (int i = 0; i < points.length - 1; i++) { 

				x1 = super.x + points[i].getX();
				y1 = super.y + points[i].getY();
				x2 = super.x + points[i + 1].getX();
				y2 = super.y + points[i + 1].getY();

				window.line(x1, y1, x2, y2, super.color, 1); 
			}
			x1 = super.x + points[0].getX();
			y1 = super.y + points[0].getY();

			x2 = super.x + points[points.length - 1].getX(); 
			y2 = super.y + points[points.length - 1].getY(); 

			window.line(x1, y1, x2, y2, super.color, 1);
		} 
	}
	public static void main(String[] args) {
		Point[] p = {
				new Point(0, 40), new Point(30, 30), new Point(40, 0), 
				new Point(50, 30), new Point(80, 40), new Point(50, 50),
				new Point(40, 80), new Point(30, 50) 
		}; 
		NSides star1 = new NSides(50, 100, p, Color.RED);
		NSides star2 = new NSides(100, 150, p, Color.GREEN);
		NSides star3 = new NSides(175, 125, p, Color.BLUE); 
		PaintWindow window = new PaintWindow(); 
		star1.paint(window);
		star2.paint(window); 
		star3.paint(window);
	}
}
