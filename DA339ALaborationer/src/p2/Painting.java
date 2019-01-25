package p2;

public class Painting {	
	private String title;												//Instansvariabler skapas
	private String painter;
	private int year;
	
	public Painting(String title, String painter, int year) {				//En konstruktor skapas detta är vår "ritning" till objektet Painting
		this.title = title;												//Variablerna i denna klassen tildelas parrametrar som bestäms då konstrukort annropas
		this.painter = painter;									
		this.year = year;
	}
	
	public String getTitle() {											//Get-metoder skapas, dessa är "public" så att dem skall vara åtkommliga från andra klasser
		return this.title;												//Funktionen med "get" metoder är att kunna ge tillgång till vårt skapade objekts egenskaper
	}															
	
	public String getPainter() {
		return this.painter;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String toString() {
		return this.title + " av " + this.painter + ", " + this.year;		//toString används för att visa vårt objekt som en Sträng som i detta fall, namn, år och titel.
	}

}
