package p2Granskning;

import java.util.Observable;

import javax.swing.Icon;
import javax.swing.SwingUtilities;

public class IconManager extends Observable {
	Buffer<Icon> icons;
	Thread thread = null;
	IconChanger iconChanger;
	
	Callback serverCallback;//  added for p2
	
	public IconManager(Buffer<Icon> i) {
		this.icons = i;
		iconChanger = new IconChanger();
	}
	
	
	/////////////////////  added for p2 ///////////////////////////
	public IconManager(Buffer<Icon> i,Callback serverCallback) {
		this.icons = i;
		iconChanger = new IconChanger();
		this.serverCallback=serverCallback;
	}
	//////////////////////////////////////////////////
	

	public void start() {
		if (thread == null) {
			thread = new Thread(iconChanger);
			thread.start();
		}
	}

	public void stop() {
		if (thread != null) {
			thread.interrupt();
			thread = null;
		}
	}
// sends icons to viewer with observe/observable
	private class IconChanger implements Runnable {
		public void run() {

					
					while (!Thread.interrupted()) {
						try {
							setChanged();
							Icon tempIcon=icons.get();
							notifyObservers(tempIcon);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				
					}
					thread=null;
				
			
		}
	}

}

/**
 * must send to server via interface
 * 
 * 
 * 
 * 
 * 
 * */
