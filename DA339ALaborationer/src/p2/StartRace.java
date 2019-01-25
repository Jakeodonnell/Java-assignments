package p2;

import javax.swing.ImageIcon;
import p1.PaintWindow;

public class StartRace {
	
	public static void main(String[] args) {
		PaintWindow window = new PaintWindow();
		Car c1 = new Car(new ImageIcon ("images/CarBlue.GIF"));
		Car c2 = new Car(new ImageIcon("images/CarRed.GIF"));
		Race race = new Race(window,c1,c2);
		race.action();
		if(args.length>0) {

		}	PaintWindow.pause(20000); 
		window.dispose();
	}
}
