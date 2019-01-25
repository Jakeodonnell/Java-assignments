package laboration4;

public class Exercise2b implements Runnable{

	private String[] string;
	private long pause;
	private int i = 0;

	public Exercise2b (String[] string) {
		this(string, 1000);
	}
	public Exercise2b(String[] string, long pause) {
		this.string = string.clone();
		this.pause = pause;
	}

	public void run() {

		while(i < string.length) {
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
		Thread t2a = new Thread(new Exercise2b(strings1));
		Thread t2b = new Thread(new Exercise2b(strings2));
		t2a.start();
		t2b.start();
	}
}
