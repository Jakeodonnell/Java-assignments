package laboration4;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


import laboration3.PaintWindow;

public class Program4j {
	public void showImage() {
		ImageIcon spring = new ImageIcon("images/Spring.jpg");
		ImageIcon summer = new ImageIcon("images/Summer.jpg");
		ImageIcon autumn = new ImageIcon("images/Autumn.jpg");
		ImageIcon winter = new ImageIcon("images/Winter.jpg");
		PaintWindow window;
		Text text=null;
		Calendar cal = Calendar.getInstance();
		ImageIcon image=null;

		int month = cal.get(Calendar.MONTH) +1;

		switch (month) {
		case 1: case 2: case 12:
			image = winter;
			break;
		case 3: case 4: case 5:
			image = spring;
			break;
		case 6: case 7: case 8:
			image = summer;
			break;
		case 9: case 10: case 11:
			image = autumn;

		}
		window = new PaintWindow(image);



		if(month == 1 || month == 2 || month == 12) {
			text = new Text ("VINTER", new Font("SansSerif",Font.BOLD,20),
					Color.BLACK,Color.WHITE);
		}

		else if ( month == 3 || month == 4 || month==5 ) {
			text = new Text("VÅR", new Font("SansSerif",Font.BOLD,20),
					Color.BLACK,Color.WHITE);

		}

		else if ( month == 6 || month == 7 || month==8 ) {
			text = new Text("SOMMAR", new Font("SansSerif",Font.BOLD,20),
					Color.BLACK,Color.WHITE);
		}

		else {
			text = new Text("HÖST", new Font("SansSerif",Font.BOLD,20),
					Color.BLACK,Color.WHITE);
		}
		window.showImage(text,0,0);
	}


	public static void main(String[] args) {
		Program4j prog = new Program4j();
		prog.showImage();
	}
}



