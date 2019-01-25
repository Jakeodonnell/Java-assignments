package laboration14;

import java.awt.*;
import javax.swing.*;

import laboration15.IconWindow;

public class Exercise3 implements Icon {
	private Color blue = Color.blue;
	private Color cyan = Color.cyan;
	private Color green = Color.green;
	private Color orange = Color.orange;
	private Color black = Color.black;
	private Color brown = new Color(222,184,135);



	public void paintIcon(Component c, Graphics g, int x, int y) {
		
		g.setColor(cyan);
		g.fillRect(0, 0, 1080, 200);
		g.setColor(blue);
		g.fillRect(0, 200, 1080, 520);
		g.setColor(orange);
		g.fillOval(50, 100, 100, 100);
		
		
		
		//bird
		g.setColor(black);
		g.drawLine(150, 150, 130, 130);
		g.drawLine(130, 130, 110, 150);
		g.drawLine(110, 150, 90, 130);
		g.drawLine(90, 130, 70, 150);
		
		g.drawLine(250, 250, 230, 230);
		g.drawLine(230, 230, 210, 250);
		g.drawLine(210, 250, 190, 230);
		g.drawLine(190, 230, 170, 250);
		
		g.drawLine(350, 350, 330, 330);
		g.drawLine(330, 330, 310, 350);
		g.drawLine(310, 350, 290, 330);
		g.drawLine(290, 330, 270, 350);
		
		//båt
		
		g.setColor(brown);
		g.fillRect(0, 500, 1080, 300);

		
		Graphics2D g2 = (Graphics2D)g; 
	}
	public int getIconWidth() {
		return 1080; 
		
	}
	public int getIconHeight() {
		return 720; 
	}
	public static void main(String[] args) { 
		IconWindow.showIcon( new Exercise3() );
	}
}
