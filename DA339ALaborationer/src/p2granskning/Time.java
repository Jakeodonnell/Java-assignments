package p2granskning;
import java.util.*;

public class Time {
	private int hour;
	private int minute;
	private int second;
	Calendar cal = Calendar.getInstance();

	public Time() {
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void update() {
		cal.setTime( new Date() );
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
