package p2Granskning;

public class IconProducerManager {
	private Buffer<IconProducer> buffer;
	
	public IconProducerManager(Buffer<IconProducer> b) {
		this.buffer=b; //buffer instance with construction
	}
	/*
	 * puts IconProducer in Buffer if not null
	 */
	public void addIconProducer(IconProducer ip) {
		if(ip!=null) {
			buffer.put(ip);
		}
	}
}
