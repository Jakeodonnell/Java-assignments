package p1granskning;
import java.util.Random;
import javax.swing.*;

public class Exercise1 {

	/*
	 * Metoden beräknar totala biljettpriset och det genomsnittliga
	 * biljettpriset för ett antal vuxna, barn och pensionärer.
	 **/	
	public void exercise1a() {
		//Deklaration av anv�nda variabler
		int antaletVuxna, antaletBarn, antaletPensionarer, prisVuxna, prisBarn,
		prisPensionarer, totalPris, prisGenomsnitt;

		//Antal av respektive kategori som ska k�pa en biljett
		antaletVuxna = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna"));
		antaletBarn = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet barn"));
		antaletPensionarer = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pension�rer"));

		//Anger pris f�r respektive kategori
		prisVuxna = 110;
		prisBarn = 60;
		prisPensionarer = 80; 

		//R�knar ut det totala priset f�r biljetterna
		totalPris = (antaletVuxna * prisVuxna + antaletBarn * prisBarn + antaletPensionarer * prisPensionarer);
		//Ber�knar det genomsnittliga priset per person
		prisGenomsnitt = (totalPris / (antaletVuxna + antaletBarn + antaletPensionarer)); 

		//Visa det totala priset och ett genomsnittspris
		JOptionPane.showMessageDialog(null, "Totala priset �r: " + totalPris + "kr" + "\nGenomsnittspriset �r: " + prisGenomsnitt + "kr");
	}

	public void exercise1b() {
		for (int i=1; i<=99; i++){ //loop upprepas varje tal 1-99
			if (i % 2 != 0){	   //varje tal som inte �r delbart med 2 �r udda
				System.out.print(i + " ");	//Skriv ut alla tal som fyller upp kravet p� variabel 'i'
			}
		}
	}

	public void exercise1c() {
		int tal;
		for (int i = 1; i <= 4; i++) { //loop upprepas 4 g�nger
			tal = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett tal")); //h�mtar hem ett v�rde fr�n JOptionPane och deklarerar 'tal' sitt v�rde
			if (tal > 0){ 
				System.out.println("Talet " + tal + " �r positivt"); //Skriver ut om talet �r st�rre �n 0, �r talet positivt
			} else if(tal < 0 ) {
				System.out.println("Talet " + tal + " �r negativt"); //Skriver ut om talet �r mindre �n 0, �r talet negativt
			} else {
				System.out.println("Talet " + tal + " �r noll"); //Skriver ut om talet �r 0
			}
		}

	}

	public void exercise1d(){
		int min, max;

		min = Integer.parseInt(JOptionPane.showInputDialog("Ange minsta v�rdet")); //H�mtar v�rde fr�n JOptionPane, och deklarerar min det v�rdet
		max = Integer.parseInt(JOptionPane.showInputDialog("Ange st�rsta v�rdet")); //H�mtar v�rde fr�n JOptionPane, och deklarerar max det v�rdet

		for (int i = min; i <= max; i +=7){ //Variabel 'i' b�rjar r�kna ifr�n min, till <= max, och plusar med 7 varje g�ng
			if (min < max) {				//Om min �r mindre �n max,
				System.out.print(i + ", "); //Printa ut 'i' med ett mellanslag, och komma-tecken mellan varje tal
			}
		}

	}

	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -3;  //Hur snabbt bilden r�r sig horisontellt
		int dy = 0; //Hur snabbt bilden r�r sig vertikalt
		int x = 250; //Var i det horisontella ledet som bilden b�rjar r�ra sig
		int y = rand.nextInt(height-100);  // Bildens höjd är 100

		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			if(x<0) {			   // Om bilden r�r sig l�ngre �t v�nster �n 0, �k tillbaks
				dx = -dx;
			}
			else if(x>515) {	   //om bilden r�r sig l�ngre �t h�ger �n 515, �k tillbaks
				dx = -dx;
			}
		}
	}
	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = rand.nextInt(7)- 3;  //Hur snabbt bilden r�r sig horisontellt
		int dy = rand.nextInt(7) - 3; //Hur snabbt bilden r�r sig vertikalt
		int x = rand.nextInt(500); //Var i det horisontella ledet som bilden b�rjar r�ra sig
		int y = rand.nextInt(height-100);  // Bildens h�jd är 100

		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa f�rflyttning
			x += dx;
			y += dy;
			if(x<0) {			   // Om bilden r�r sig l�ngre �t v�nster �n 0, �k tillbaks
				dx = -dx;
			}
			else if(x>515) {	   //om bilden r�r sig l�ngre �t h�ger �n 515, �k tillbaks
				dx = -dx;
			}
			if(y<0) {			   //Om bilden �ker �ker l�ngre upp �n 0, �k ner
				dy = -dy;
			}
			else if(y>310) {	   //Om bilden �ker l�ngre ner �n 310, �k upp
				dy = -dy;
			}
		}

	}
}
