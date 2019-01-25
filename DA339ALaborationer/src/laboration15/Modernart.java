package laboration15;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.Icon;

import laboration14.Exercise3;

public class Modernart implements Icon{

	Random rand = new Random();
	private Color black = Color.black;
	private int randwidth = rand.nextInt(17)+4;
	private int randheight = rand.nextInt(10)+5;
	private int width = 1300;
	private int height = 720;


	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g; 

		g.setColor(black);
		g.fillRect(0, 0, width, height);

		for(int i = 0; i<= 100; i++) {
			
			g2.setPaint(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255))); 
			g2.setStroke( new BasicStroke( randwidth ) );
			g2.fillOval(rand.nextInt(width), rand.nextInt(height), rand.nextInt(50), rand.nextInt(100));
			g2.fillRect(rand.nextInt(width), rand.nextInt(height), rand.nextInt(50), rand.nextInt(100));
			g2.draw(new Line2D.Double(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height)));
		}
	}

	public int getIconWidth() {
		return width;
	}

	public int getIconHeight() {

		return height;
	}
	public static void main(String[] args) { 
		IconWindow.showIcon( new Modernart() );
	}

}
