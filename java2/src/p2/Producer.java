package p2;

import javax.swing.Icon;
/**
 * Producer is a class that extends thread, it can implement an arraylist of icon - and iconPproducer - objects.
 * 
 * @author Jake ODonnell
 *
 */
public class Producer {
	
	private Buffer<IconProducer> prodBuffer;
	private Buffer<Icon> iconBuffer;
	private Thread thread;
	
	 /**
     * This constructor has two in-parameters and defines them with a variable name.
     * @param prodBuffer
     * @param iconBuffer
     */

	public Producer(Buffer<IconProducer> prodBuffer, Buffer<Icon> iconBuffer) {
		this.prodBuffer = prodBuffer;
		this.iconBuffer = iconBuffer;
	}
	
	/**
	 * This method "starts" the execution of "run" on a condition given in the if statement.
	 */
	public void start() {
		if(thread==null) {
			thread = new Read();
			thread.start();
		}
	}

	private class Read extends Thread {
		
		/**
		 * This method is what makes the thread. In this case the thread runs as long as "Thread" is not interrupted, this is tested with "Thread.interrupted".
		 */
		
		public void run() {
			while(!Thread.interrupted()){
				try {
					IconProducer iconProd = prodBuffer.get();
					for (int i = 0; i < iconProd.times(); i++) {
						for (int o = 0; o < iconProd.size(); o++) {
							iconBuffer.put(iconProd.nextIcon());
							Thread.sleep(iconProd.delay());
						}
					}
				} catch (InterruptedException e) {
					System.out.println(e.toString());  
				}
			}
		} 
	}
}