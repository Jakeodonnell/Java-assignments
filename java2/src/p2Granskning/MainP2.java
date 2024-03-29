package p2Granskning;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class MainP2 {
	public static void main(String[] args) {
		int port = 3520; //3520 ROLF
		
		Buffer<Icon> iconBuffer = new Buffer<Icon>();
		Buffer<IconProducer> producerBuffer	= new Buffer<IconProducer>();
		
		IconManager iconManager = new IconManager(iconBuffer);
		new ViewerWindow( new Viewer(iconManager,320,320),100,100 );
		new ViewerWindow( new Viewer(iconManager,320,320),450,100 );
		
		IconServer iconServer = new IconServer(iconManager, port); // start av server
		
		IconClient iconClient1 = new IconClient("127.0.0.1", port,"Client1"); // start av client1
		new ViewerWindow( new P2Viewer(iconClient1, 320,320),100,450);
		new ViewerWindow( new P2Viewer(iconClient1, 320,320),450,450);
		IconClient iconClient2 = new IconClient("127.0.0.1", port,"Client2"); // start av client2
		new ViewerWindow( new P2Viewer(iconClient2, 320,320),800,100);
		
		iconManager.start();
		
		Producer producer = new Producer(producerBuffer,iconBuffer);
		producer.start();
		
        IconProducerManager ipManager = new IconProducerManager(producerBuffer);
        ipManager.addIconProducer(new FileProducer("files/new.txt"));
	}
}
