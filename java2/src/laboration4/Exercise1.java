package laboration4;

import java.util.Timer;
import java.util.TimerTask;

public class Exercise1 {
	private String [] string;
	private long pause;
	private Timer timer;

	public Exercise1(String[] string, long pause) {
		this.string = string.clone();
		this.pause = pause;
		timer = new Timer();
		timer.schedule(new Start(), 0, 1000);
	}

	public Exercise1(String[] string) {
		this(string, 1000); 
	}

	public class Start extends TimerTask {

		private int i = 0;

		public void run() {
			
			if(i < string.length) {
				System.out.println(string[i]);
				i ++;
			} else {
				timer.cancel();
			}
		} 
	} public static void main(String[] args) {
		String[] strings1 = {"Jag heter Rut", "Du heter Sven", "Han heter Ola"};
		String[] strings2 = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag",
		 "Lördag", "Söndag"};
		Exercise1 ex1a = new Exercise1(strings1);
		Exercise1 ex1b = new Exercise1(strings2);
	}
}
