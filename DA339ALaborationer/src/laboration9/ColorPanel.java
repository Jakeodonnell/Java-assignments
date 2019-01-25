package laboration9;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.util.*;

public class ColorPanel extends JPanel{

	Random rand = new Random();

	private JLabel jlfärg = new JLabel("Välj färg");
	private JRadioButton jrbröd = new JRadioButton("Röd");
	private JRadioButton jrbgrön = new JRadioButton("Grön");
	private JRadioButton jrbblå = new JRadioButton("Blå");
	private JRadioButton jrbslump = new JRadioButton("Slump");
	
	public ColorPanel() {


		setPreferredSize( new Dimension (200, 130) );
		
		jlfärg.setPreferredSize(new Dimension(180, 20));
		ButtonGroup group = new ButtonGroup();
		jrbröd.setPreferredSize(new Dimension(180, 20));
		jrbgrön.setPreferredSize(new Dimension(180, 20));
		jrbblå.setPreferredSize(new Dimension(180,20));
		jrbslump.setPreferredSize(new Dimension(180,20));
		group.add(jrbröd);
		group.add(jrbgrön);
		group.add(jrbblå);
		group.add(jrbslump);

		addListeners();
		
		add(jlfärg);
		add(jrbröd);
		add(jrbgrön);
		add(jrbblå);
		add(jrbslump);
		
		
	}
	
	private void addListeners () {
		
		ColorListener listener = new ColorListener();
		
		jrbgrön.addActionListener(listener);
		jrbröd.addActionListener(listener);
		jrbblå.addActionListener(listener);
		jrbslump.addActionListener(listener);
		
	}
	
	
		
		private class ColorListener implements ActionListener { 
			public void actionPerformed(ActionEvent e) {
				if (jrbröd.isSelected()==true) {
				setBackground(Color.RED);
			} else if (jrbgrön.isSelected()==true) {
				setBackground(Color.GREEN);
			} else if (jrbblå.isSelected()==true) {
				setBackground(Color.BLUE);
			} else if (jrbslump.isSelected()==true) {
				Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
				setBackground(color); }
			}

		}

		public static void main(String [] args) {
			ColorPanel panel = new ColorPanel(); 
			panel.setBorder(BorderFactory.createLineBorder(Color.black)); 
			JOptionPane.showMessageDialog(null, panel);
		}
	}