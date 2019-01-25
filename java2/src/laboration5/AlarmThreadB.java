package laboration5;

import java.util.LinkedList;

public class AlarmThreadB {
	private LinkedList <AlarmListener> list = new LinkedList<AlarmListener>();
	private Thread thread;
	private long ms;

	public AlarmThreadB(long ms) {
		this.ms = ms;
	}

	public void addAlarmListener(AlarmListener listner) {
		if(listner!=null)
			list.add(listner);
	}

	public void startAlarm() {
		if(thread==null) {
			thread = new AT(); 
			thread.start();
		}
	}

	private class AT extends Thread {
		public void run() {
			try {
				Thread.sleep(ms);
			}catch(InterruptedException e) {
			} for(AlarmListener al : list) {
				al.alarm();
			}
			thread = null;
		}
	}
}

