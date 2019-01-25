package laboration4;

import java.util.Timer;

public class Exercise2a extends Thread {

	private String[] string;
	private long pause;
	private int i = 0;

	public Exercise2a(String[] string) {
		this(string, 1000);
	}

	public Exercise2a(String[] string, long pause) {
		this.string = string.clone();
		this.pause = pause;
	}

	public void run() {
		while ( i < string.length) {
			System.out.println(string[i]);
			i ++;
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {}
		}
	}
	public static void main(String[] args) {
		String[] strings1 = {"Jag heter Rut", "Du heter Sven", "Han heter Ola"};
		String[] strings2 = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag",
				"Lördag", "Söndag"};
		Exercise2a ex2a = new Exercise2a(strings1);
		Exercise2a ex2b = new Exercise2a(strings2);
		ex2a.start();
		ex2b.start();
	}
}
