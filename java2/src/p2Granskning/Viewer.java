package p2Granskning;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Viewer extends JPanel implements Observer{
	private JLabel lblIcon = new JLabel();
	IconManager iconManager;
	
	
	public Viewer(IconManager im, int width, int height) {
		this(width,height);
		this.iconManager=im; // reference to Observable 
		im.addObserver(this);
	}
	
	public Viewer(int width, int height) {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		lblIcon.setOpaque(true);
		add(lblIcon);
		setPreferredSize(new Dimension(width,height));
	}

	public  void setIcon(Icon icon) {
		lblIcon.setIcon((ImageIcon)icon);
//		JOptionPane.showMessageDialog(null, icon);
//		System.out.println(icon.toString());
	}
	
	//icon change when observable iconManager setChanged()==true
	public void update(Observable obs, Object obj) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
//				System.out.println(obj.toString());
				setIcon((ImageIcon)obj);
			}
		});
			
		
		
		
	}
}













/*
public class Viewer extends JPanel {
	private JLabel lblIcon = new JLabel();
	
	public Viewer(int width, int height) {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		lblIcon.setOpaque(true);
		add(lblIcon);
		setPreferredSize(new Dimension(width,height));
	}

	public void setIcon(Icon icon) {
		lblIcon.setIcon(icon);
	}
}
*/