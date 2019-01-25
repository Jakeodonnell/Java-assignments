package laboration6; 
public class Counter2Thread extends Thread {
    private Counter2 counter;
    
    public Counter2Thread(Counter2 counter, String name) {
    	this.counter = counter;
    	this.setName(name);
    }
//	synchronized(counter) { // prova även med this som argument
//} // vad händer om även rad 19 ingår i synchronized-satsen?
     
    // testa som argument till synchronized-satsen a) counter b) this
    public void run() {
    	int value;
        System.out.println(getName() + " startar");
        while (true) {
        	synchronized(counter) {
        		counter.incCounter();
        		value = counter.getCounter();
        	    System.out.println(getName()+": "+value);
        	}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
    
    public static void main(String[] args) {
		Counter2 counter = new Counter2();
		Counter2Thread ct1 = new Counter2Thread(counter,"A");
		Counter2Thread ct2 = new Counter2Thread(counter,"B");
		ct1.start();
		ct2.start();
	}
}
