package p2Granskning;

import javax.swing.Icon;

public class Producer {
	Buffer<IconProducer> iconProducers;
	Buffer<Icon> icons;
	Thread thread = null;

	public Producer(Buffer<IconProducer> producer, Buffer<Icon> icons) {
		this.iconProducers = producer;
		this.icons = icons;
	}

	public void start() {
		if (thread == null) {
			thread = new Thread(new IconMover());
			thread.start();
		}
	}

	public void stop() {
		if (thread != null) {
			thread.interrupt();
			thread = null;
		}
	}

	public int size() {
		return icons.size();
	}
	
	public Icon nextIcon() throws InterruptedException {
		return icons.get();
	}
	
	private class IconMover implements Runnable {
		public void run() {
			IconProducer iconProducer=null;

			while (!Thread.interrupted()) {
				try {
					iconProducer = iconProducers.get();
				} catch (InterruptedException e) {
				}

				for (int i = 0; i < iconProducer.times(); i++) {
					for (int j = 0; j < iconProducer.size(); j++) {
						try {
							icons.put(iconProducer.nextIcon());
							Thread.sleep(iconProducer.delay());
							
						} catch (InterruptedException e) {
						}
						
					}
				}
				
		//		break;
			}
			thread=null;
		}
	}

}
