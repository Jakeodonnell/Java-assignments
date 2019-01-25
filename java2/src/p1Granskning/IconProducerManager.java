package p1Granskning;

import javax.swing.Icon;

public class IconProducerManager {

	private Buffer<IconProducer> buffer;

	public IconProducerManager(Buffer<IconProducer> buffer) {
		this.buffer = buffer;
	}

	public void addIconProducer(IconProducer iconProducer) {
		for (int i = 0; i < iconProducer.times(); i++) {
			buffer.put(iconProducer);
		}
	}

}
