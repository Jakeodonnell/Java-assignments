package p2;

import java.util.Observable;

import javax.swing.Icon;

public class IconManager extends Observable{
	private Buffer<Icon> iconBuffer;
	private Thread startActivity;

	public IconManager(Buffer<Icon> iconBuffer) {
		this.iconBuffer = iconBuffer;
		startActivity = new StartActivity();
	}

	public void start() {
		startActivity.start();
	}

	public void stop() {
		startActivity.interrupt();
	}

	private class StartActivity extends Thread {
		public void run (){
			Icon icon = null;
			while(!Thread.interrupted()){
				if(iconBuffer.size() != 1) {
					try {
						icon = iconBuffer.get();
					} catch (InterruptedException e) {}
					setChanged();
					notifyObservers(icon);
				}
			}
		}
	}
}