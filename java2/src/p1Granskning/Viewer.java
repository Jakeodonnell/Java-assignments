package p1Granskning;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Viewer extends JPanel implements ProgressListener {
	private JLabel lblIcon = new JLabel(); 
	private IconManager iconManager;
	
	public Viewer(IconManager iconManager, int width, int height) {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		lblIcon.setOpaque(true);
		add(lblIcon);
		setPreferredSize(new Dimension(width,height));
		
		// Adds itself so that it can be updated in the IconManager.
		
		this.iconManager = iconManager;
		iconManager.addProgressListener(this);
	}

	public void setIcon(Icon icon) {
		lblIcon.setIcon(icon);
	}

	@Override
	public void progress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Icon icon) {
		// TODO Auto-generated method stub
		setIcon(icon);
		
	}

	@Override
	public void exception() {
		// TODO Auto-generated method stub
		
	}
}
