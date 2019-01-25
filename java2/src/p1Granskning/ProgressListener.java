package p1Granskning;

import javax.swing.Icon;

public interface ProgressListener {
	
	public void progress();
	
	public void update(Icon icon);
	
	public void exception();
	
}