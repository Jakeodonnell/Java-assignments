package p2Granskning;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class P2Viewer extends JPanel implements Callback{
	private JLabel lblIcon = new JLabel();
	IconClient client;

	
	public P2Viewer(IconClient c, int width, int height) {
		this(width,height);
		this.client=c; // reference to Observable 
		c.addCallback(this);
		System.out.println("Viewer adds callback");
	}
	
	public P2Viewer(int width, int height) {
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
	
	//icon change when Callback on IconCLient sends Icon
	public void update(Object o) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
//				System.out.println(obj.toString());
				setIcon((ImageIcon)o);
			}
		});
			
		
		
		
	}
}


