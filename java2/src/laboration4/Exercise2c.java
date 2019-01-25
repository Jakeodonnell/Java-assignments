package laboration4;

public class Exercise2c {

	private Activity thread;
	private String[] string;
	private long pause;

	public Exercise2c(String[] string) {
		this(string, 1000);
	}

	public Exercise2c(String[] string, long pause) {
		this.string = string.clone();
		this.pause = pause;
	}

	public void start() {
		if(thread==null) { 
			thread = new Activity(); 
			thread.start();
			Observable
	}

	public class Activity extends Thread {

		private int i = 0;

		public void run() {
			while(i < string.length) {
				System.out.println(string[i]);
				i ++;
				try {
					Thread.sleep(pause);
				} catch (InterruptedException e) {}
			}	
		}	
	}
	public static void main(String[] args) {
		String[] strings1 = {"Jag heter Rut", "Du heter Sven", "Han heter Ola"};
		String[] strings2 = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag",
		 "Lördag", "Söndag"};
		Exercise2c ex2a = new Exercise2c(strings1);
		Exercise2c ex2b = new Exercise2c(strings2);
		ex2a.start();
		ex2b.start();
	}
}