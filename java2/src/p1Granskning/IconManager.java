package p1Granskning;

import java.util.ArrayList;


import javax.swing.Icon;

public class IconManager {
	private Worker thread;
	private Buffer <Icon> buffer;
	private ArrayList<Viewer> listeners = new ArrayList<Viewer>();
	
	public IconManager(Buffer<Icon> buffer) 
	{
		this.buffer = buffer;
	}
	
	public void addProgressListener(Viewer listener) 
	{
		 listeners.add(listener);
	}
	
	public void start() 
	{
		if(thread == null) {
			
			this.thread = new Worker();
			thread.start();
		}
	}
	
	
	
	private class Worker extends Thread 
	{
		public void run()
		{
			
			Icon icon;
			while(true)
			{
				try {
					
					while(true) {
						icon = buffer.get();
						System.out.println(icon.toString());
						for(int i = 0; i < listeners.size(); i++) {
							
							listeners.get(i).update(icon);
						}
						
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}


	

}
