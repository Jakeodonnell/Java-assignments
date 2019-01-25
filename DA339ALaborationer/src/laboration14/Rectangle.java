package laboration14;

import java.awt.Color;

public class Rectangle extends Shape{

	PaintWindow pw = new PaintWindow();
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, color);
		this.height = height;
		this.width = width;

	}

	public void paint(PaintWindow window) {
		window.line(super.x, super.y, super.x + this.width, super.y, this.color, 1);
		window.line(super.x + this.width, super.y, super.x + this.width, super.y + this.height, super.color, 1 );
		window.line(super.x, super.y + this.height, super.x + this.width, super.y + this.height, super.color, 1 );
		window.line(super.x, super.y, super.x, super.y + this.height, super.color, 1 );
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle( 100, 50, 200, 150, Color.BLACK ); 
		Rectangle rect2 = new Rectangle( 80, 150, 100, 150, Color.RED);
		PaintWindow window = new PaintWindow();
		rect1.paint( window );
		rect2.paint( window );
	}
}
