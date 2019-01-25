package laboration5;

import java.util.Observable;
import java.util.Observer;

public class DemoAlarmA {
	public DemoAlarmA(int ms) {
		AlarmThreadA at = new AlarmThreadA(ms);
		at.addObserver(new AlarmPrinter());
		at.addObserver(new WakeUpPrinter());
		at.addObserver(new ConsolePrinter("Hej din lilla tjuv"));
		at.startAlarm();
	}

	public static void main(String[] args) {
		DemoAlarmA da = new DemoAlarmA(4000);
	}

	public class AlarmPrinter implements Observer{

		public void update(Observable o, Object arg) {
			System.out.println("ALARM"); 
		}
	}

	public class WakeUpPrinter implements Observer{

		public void update(Observable o, Object arg) {
			System.out.println("WAKE UP");
		}	
	}

	public class ConsolePrinter implements Observer{

		private String message;
		
		public ConsolePrinter(String message) { 
			this.message = message;
		}
		
		public void update(Observable o, Object arg) {
			System.out.println(message);
		} 
	}
}
