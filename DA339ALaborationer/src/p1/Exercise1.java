	package p1;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise1 {

	/*
	 * Metoden beräknar totala biljettpriset och det genomsnittliga
	 * biljettpriset för ett antal vuxna, barn och pensionärer.
	 **/	
	public void exercise1a() {

		// Variabler får ett namn som sedan skall definieras i koden längre ner, variablerna är av typen integer, detta betyder att variablen kommer innehålla ett heltal.
		int vuxen, barn, pensionär, totalabelopp, genomsnittspris, antalpersoner;

		// variablerna nedan definieras, i detta fall som en integer (ett heltal), Int väljs pga att man kan ej betala för 0.5 personer, endast HELA personer. 
		//"Integer.parseInt" används då användaren skriver in en text, exempel "10", detta konverteras från ett "ord" till en siffra med hjälp av denna kod.
		//"showInputDialog" används för att presentera en ruta där användaren kan ange en text, innanför paranteserna och citattecken presenteras texten som visas för användaren, samt nedanför texten presenteras en svars ruta där användaren ska skriva in ett svar.
		// denna förklaring gäller dem följande raderna: 21, 22, 23.
		vuxen = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna"));
		barn = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet barn"));
		pensionär = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pensionärer"));

		//Variablen "totalabelopp" definieras på rad 27, denna definieras med antal vuxna angivet i definieringen av integerna "vuxen, barn och penisonär" samt multipliceras med priset för var individ,
		//i detta fallet 110 kr för vuxen, 60 kr för barn och 80 kr för pensionär, denna variabel är också en Integer då den innehåller endast hela siffror
		totalabelopp = ((110 * vuxen) + (60 * barn) + (80 * pensionär));
		//Variablen "antalpersoner" definieras på rad 29, denna variabel får definitionen på summan av antalet personer i sällskapet angivet i de tre variablerna "vuxen, barn och pensionär".
		antalpersoner = (vuxen + barn + pensionär);
		//Variablen "genomsnittspriset" definieras på rad 31, denna variablen får definitionen att inehava integern (hel talet) av det totala beloppet dividerat på antal personer som är båda angivna i tidigare definitioner av variabler ovan(totalbelopp, antalpersoner)
		genomsnittspris = (totalabelopp / antalpersoner);

		// rad 34 presenterar en dialogruta med text där totala priset presenteras samt det genomsnittliga priset per person liak så presenteras på raden under. här anges endast text och variabler då beräkningar är definierade i variablarna ovan.
		JOptionPane.showMessageDialog(null, "Totala priset är: " + totalabelopp + "kr" + "\nGenomsnittspriset är: " + genomsnittspris);
	} 

	public void exercise1b() {
		//En "for loop" definieras med en initiering av värdet "0", samt ett vilkor för uppdatering som säger att loopen skall uppdateras sålänge i <= 100 och stämmer dem villkoren skall den uppdateras med i += 1
		for(int i=0; i<=100; i++) {
			// En regel i "for loopen" skapas vilket säger att om talet "i" som ökar med "1" vid varje exekvering INTE är delbart med 2 (vilket betyder att det är ett udda tal)
			//skall denna siffra skrivas ut i consolen nedan samt ha ett mellanrum  efter siffran, detta för att inte alla siffror skall sitta ihop i consolen.
			// är talet delbart med 2 händer ingenting och "i" forsätter att öka med + 1 då loopen exekveras igen.
			if(i %2 !=0) {
				System.out.print(i + " ");
			}
		}
	}

	public void exercise1c() {
		//Variablen av typen integer (heltal) får sitt definierade namn.
		int nbr;
		//En for loop skapas med initieringen 1, uppdateringsvilkor som säger att uppdatering kan ske sålänge i <= 4 och då skall den uppdateras med i +=1
		for(int i = 1; i <= 4; i++) {
			//Variablen nbr definieras, i definitionen säger vi att "texten" som skrivs in av användaren i den skapade dialog rutan skall sparas som ett heltal och inte som text, detta med hjälp av "Integer.parseInt" som omvandlar text till siffra.
			nbr = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett tal"));
			//En if sats skapas som säger att om nbr är mindre än 0 skall en text skrivas ut efter talet "nbr" och säga att talet är negativt
			if (nbr < 0) {
				System.out.println("Talet " + nbr + " är negativit");
				//Fortsätning på if sats skaps vilket säger att om nbr är = 0 skall följade exekveras. det som exekveras blir en print i console med talet "nbr" samt ett text stycke som säger " Talet är noll".
			} else if (nbr == 0) {
				System.out.println("Talet " + nbr + " är noll");
				// om ovanstånde inte stämmer ("if" och "else if") skall fäljande exekveras, talet skrivs ut samt ett text stycke vilket säger att " Talet är positivt".
			} else {
				System.out.println("Talet " + nbr + " är positivt");

			}
		}
	}

	public void exercise1d() {
		//Variabler skapas i typen Integer (heltal) samt namnges
		int minvärde, maxvärde;
		//Variablerna definieras samt converterar användarens inmatning i den skapade dialogrutan till ett heltal med hjälp av "integer parse Int"
		minvärde = Integer.parseInt(JOptionPane.showInputDialog("Ange ett minimum värde"));
		maxvärde = Integer.parseInt(JOptionPane.showInputDialog("Ange ett maximum värde"));

		//En for loop skapas som har ett initieringsvärde definierat av användaren då den gav "minvärde" ett värde, uppdateringsvärdet angavs lika så av användaren definerat av "maxvärde", uppdateringen skre sålänge i är mindre eller lika med maxvärde.
		for(int i = minvärde; i <= maxvärde; i +=7){
		//vid varje exekvering av loopen skrivs i ut följt av ett mellanrum, detta så att inte alla siffror skall sitta ihop utan mellanrum
			System.out.print(i + " ");

		}
	}
	
	public void exercise1e() {
		//Ett fönster skapas somt importeras för att kunna tec rita eller visa bildet etc.
		PaintWindow pw = new PaintWindow();
		//En random variabel skapas och importeras som nu kan göra att vi kan slumpa tex olika tal 
		Random rand = new Random();
		// en bild importeras som sedan möjligtvis kan användas i ett fönster som i detta fall i paint window fönstret
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		// Variabler skapas i namn "width" och "height" samt importeras med "paintwindow" fönstrets bredd och häjd
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		// dx och dy variabler som används för att bestämma hur snabbt bilden "image" skall röra sig, i detta fallet rör sig bilder med -3 (till vänster i x led) och noll i y led
		int dx = -3;
		int dy = 0;
		// x och y nedan bestämmer vilken possition bilden skall utgå ifrån när programmet startar. i detta fall 250 pixlar åt höger på x axeln, då nollpunkten är högst upp i vänster hörn på skärmen.
		// samt skall den börja på possition "random" "-" 100 pixlar (då det är så hög bilden är), på y axeln
		int x = 250;
		int y = rand.nextInt(height-100);  // Bildens höjd är 100

		// en while loop skapas som säger att så länge nedan är sant skall den fortsätta upprepas.
		while(true) {
			// här anropas bilden på angivna x och y kordinater angivna ovan i vårt fönster vid namn "pw".
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			//variablen x och y utökas med en regel dx samt dy som var våra värden för förflyttning i x samt y axel
			x += dx;
			y += dy;
			// en if sats skapas som säger att om x blir mindre än 0 skall den byta värde från positivt till negativt vilket gör att förflyttningen blir från att ha gått höger till vänster till att nu gå vänster till höger
			//samt tvärt om om x blir större än bredden på fönstret "-" bildens storlek gör den samma fast tvärt om
			if((x<0)||(x>width-100)) {
				dx = -dx;
			}
		}
	}

	public void exercise1f() {

		//Ett fönster skapas somt importeras för att kunna rita i detta, visa bildet etc.
		PaintWindow pw = new PaintWindow();
		//En random variabel skapas och importeras som nu kan göra att vi kan slumpa tex olika tal 
		Random rand = new Random();
		// en bild importeras som sedan möjligtvis kan användas i ett fönster som i detta fall i paint window fönstret
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		// Variabler skapas i namn "width" och "height" samt importeras med "paintwindow" fönstrets bredd och häjd
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		// dx och dy variabler som används för att bestämma hur snabbt bilden "image" skall röra sig, i detta fallet är det random värden mellan -3och 3 vilket gäller både dx och dy.
		int dx = rand.nextInt(6)-3;
		int dy = rand.nextInt(6)-3;
		// x och y definieras med två olka "random" statpunkter i vårt pw fönster, dessa värden kan vara för x:0 - 500 samt för y: 
		int x = rand.nextInt(500);
		int y = rand.nextInt(height-100);  // Bildens höjd är 100

		// en while loop skapas som säger att så länge nedan är sant skall den fortsätta upprepas.
		while(true) {
			// här anropas bilden på angivna x och y kordinater angivna ovan i vårt fönster vid namn "pw".
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			//variablen x och y utökas med en regel dx samt dy som var våra värden för förflyttning i x samt y axel
			x += dx;
			y += dy;
			// en if sats skapas som säger att om x blir mindre än 0 skall den byta värde från positivt till negativt vilket gör att förflyttningen blir från att ha gått höger till vänster till att nu gå vänster till höger
			//samt tvärt om om x blir större än bredden på fönstret "-" bildens storlek gör den samma fast tvärt om
			if(x<0||x>width-100) {
				dx = -dx;
			}
			
			//här skapas en liknande ifsats som gällde för x värdet men detta häller nu istället höjd, vilket definieras med y för y axel.
			if(y<0||y>height-100) {
				dy = -dy;
			}
		}
	}
}
