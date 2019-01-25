package laboration5;

public class DemoAlarmB {
	public DemoAlarmB(int ms) {
		AlarmThreadB bt = new AlarmThreadB(ms);
		bt.addAlarmListener(new AlarmPrinter());
		bt.addAlarmListener(new WakeUpPrinter());
		bt.addAlarmListener(new ConsolePrinter("Hello"));
		bt.startAlarm();
	}

	public static void main(String[] args) {
		DemoAlarmB da = new DemoAlarmB(1000);
	}

	public class AlarmPrinter implements AlarmListener{
		public void alarm() { 
			System.out.println("ALARM");	
		}
	}

	public class WakeUpPrinter implements AlarmListener{

		public void alarm() {
			System.out.println("WAKE UP");
		} 
	}

	public class ConsolePrinter implements AlarmListener{
		private String message;

		public ConsolePrinter(String message) { 
			this.message = message;
		}

		public void alarm() {
			System.out.println(message);
		}
	}
}
