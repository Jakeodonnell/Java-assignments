package p2;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;

import p1.PaintWindow;

public class Race {
	Random rand = new Random();																				//Random importeras

	private PaintWindow window;																				//Instansvariabler skapas
	private Car car1;	
	private Car car2;
	private Font pixels = new Font ("monospaced", Font.BOLD, 20);
	private Sound aSound = Sound.getSound("sound/goal.mp3"); 
	private ImageIcon winnerred = new ImageIcon("images/winnerred.png");
	private ImageIcon winnerblue = new ImageIcon("images/winnerblue.png");
	private ImageIcon draw = new ImageIcon("images/draw.png");
	private Text carbluepixlar = new Text ("", pixels, Color.WHITE, Color.BLUE);
	private Text carredpixlar = new Text ("", pixels, Color.WHITE, Color.RED );
	private final int x1 = 600;
	private final int xgoal = 100;
	private final int y1 = 270;
	private final int y2 = 200;
	private int dx1 = rand.nextInt(7)+1;
	private int dx2 = rand.nextInt(7)+1;
	private int carbluepixlarwindowy = 100;
	private int carredpixlarwindowy = 120;
	private int pixlarwindowx = 100;


	public Race(PaintWindow window, Car car1, Car car2) { 													//Race konsturktorn skapas, här ser vi att objektet innehåller två bilar och ett fönster

		this.window = window;																				//Konstruktorn tilldelas parrametrar som får sina värden då objektet tillkallas
		this.car1 = car1;
		this.car2 = car2;

	} 

	public void action () {																					//Metoden "action" skapas


		window.drawRect(0, 0, window.getBackgroundWidth(), window.getBackgroundWidth(), Color.GREEN, 600);		//Vårt "PaintWindow" fönster tilldelas linjer och rektanglar för att skapa i detta fall en 2D räserbana 
		window.line(0, 250, window.getBackgroundWidth(), 250, Color.GRAY, 150);

		window.line(50, 250, 100, 250, Color.white, 5);		
		window.line(150, 250, 200, 250, Color.white, 5);
		window.line(250, 250, 300, 250, Color.white, 5);
		window.line(350, 250, 400, 250, Color.white, 5);
		window.line(450, 250, 500, 250, Color.white, 5);
		window.line(550, 250, 600, 250, Color.white, 5);

		window.line(100, 150, 100, 350, Color.black, 5);

		car1.moveTo(x1, y1);																					//.moveTo anger var bilen skall plaseras i "PaintWindow"
		car2.moveTo(x1, y2);	


		while(true) {																						//en loop skapas som fortsätter att köras till dess att något i den är falskt

			PaintWindow.pause(20);																			//en paus mellan varje förflyttning anges då vi vill se bilen förflytta sig, om denna paus inte finns blir allt instat och bilen syns inte då den redan förflyttats långt

			car1.moveTo(car1.getX() - dx1, car1.getY());														
			window.showImage(car1.getImage(), car1.getX(), car1.getY());										//Bilden på bilarna säts in i vårt fönster samt dess kordinater
			car2.moveTo(car2.getX() - dx2, car2.getY());
			window.showImage(car2.getImage(), car2.getX(), car2.getY());

			carbluepixlar.setText(car1.getX() - xgoal + "");													//Texten berättar hur långt kvar bilen har till mål (räknas i pixlar)
			window.showImage(carbluepixlar, pixlarwindowx, carbluepixlarwindowy);														//Possition för textrutan
			carredpixlar.setText(car2.getX() - xgoal + "");
			window.showImage(carredpixlar, pixlarwindowx, carredpixlarwindowy);

			if(car1.getX() <= xgoal || car2.getX() <= xgoal) {												 //Om x1 eller x2 har passerat mållijen spelas ett ljud
				aSound.play();
			}

			if(car1.getX() < xgoal || car2.getX() < xgoal) {													 //Om x1 eller x2 passrat mållinjen sker följande

				if(car1.getX() < xgoal && car2.getX() > car1.getX()) {										 //Om x1(blå bil) passerat mållinjen och ligger före x2(röd bil) visas en bild som säger bil blå vann.
					window.showImage(winnerblue, 220, 150 );
				}
				else if(car2.getX() < xgoal && car1.getX() > car2.getX()) {									 //Om istället x2(röd bil) ligger före över mållinjen visas en bild att röd bil vann.

					window.showImage(winnerred, 220, 150);
				}
				else {																						 //Om ingen ligger före den andra är det lika och bilden för lika visas.
					window.showImage(draw, 220, 150);	
				}
				
				if(car1.getX() < 100 || car2.getX() < 100) {
					PaintWindow.pause(5000);
				}
			}
		}
	}
}