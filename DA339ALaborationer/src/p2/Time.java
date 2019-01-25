package p2;

import java.util.Calendar;
import java.util.Date;


public class Time {

	private Calendar cal;												//Instansvariabler skapas
	private int 	hour,minute,second;


	public Time() {														//konstruktor skapas

		this.cal = Calendar.getInstance();								//variabler definieras med värden
		this.hour = cal.get(Calendar.HOUR);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}

	public int getSecond() {												//Get-metoder skapas, dessa är "public" så att dem skall vara åtkommliga från andra klasser
		return this.second;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getHour() {
		return this.hour;
	}

	public String toString() {											//toString används för att visa vårt objekt som en Sträng som i detta fall, timme, minut och sekund.
		return  this.hour + ":" + this.minute + ":" + this.second;
	}

	public void update() {												//Update används för att återge variablerna nya värden då "update" kallas på.
		cal.setTime( new Date() );
		this.hour = cal.get(Calendar.HOUR);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}
}
