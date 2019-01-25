package p1Granskning;

import javax.swing.Icon;

public class Producer {
	Thread thread;
	private Buffer<IconProducer> bufferFrom;
	private Buffer<Icon> bufferTo;

	public Producer(Buffer<IconProducer> iconProducer, Buffer<Icon> iconBuffer) {
		this.bufferFrom = iconProducer;
		this.bufferTo = iconBuffer;
	}
	
	/**
	 * Creates a new instance of the embedded worker class which extends the thread.
	 * Only if the thread is not already instantiated. It then starts the thread.
	 */

	public void start() {

		if (thread == null) {
			thread = new Worker();
			thread.start();
		}

	}

	private class Worker extends Thread {
		
		/**
		 * This method is called when the Producer class calls the start method[In a try/catch in case of en interrupt].
		 * 
		 * 1) Gets the producer of the icons, whether its a FileProducer, ArrayProducer or ShowGubbe from the buffer.
		 * 
		 * 2) Evaluates how many times the Producer wants the Icons to run.
		 * 
		 * 3) Evaluates how many icons there are to show.
		 * 
		 * 4) Sends each icon the set number of times to the Icon buffer from the IconProducer buffer.
		 */

		public void run() {
			
			while (!Thread.interrupted()) {
				
				try {
					IconProducer iconProducer = bufferFrom.get();
					
					int size = 0; 
					int times = 0;
					while (times < iconProducer.times()) {
	
						while (size < iconProducer.size()) {
							bufferTo.put(iconProducer.nextIcon());
							size++;
							System.out.println(iconProducer.delay());
							Thread.sleep(iconProducer.delay());

						}
						times++;
					}

				} catch (InterruptedException e) {

					System.err.println(e);
				}
			}

		}
	}

}
