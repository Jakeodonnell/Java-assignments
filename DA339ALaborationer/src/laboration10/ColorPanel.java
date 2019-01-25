package laboration10;

import java.awt.*;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.*;

public class ColorPanel extends JLabel{
	
	private JRadioButton jrbröd = new JRadioButton("Röd");
	private JRadioButton jrbgröm = new JRadioButton("Grön");
	private JRadioButton jrbblå = new JRadioButton("Blå");
	private JRadioButton jrbslump = new JRadioButton("Slump");
	private JLabel jlväljfärg = new JLabel("Välj färg");
	Random rand = new Random();
	ButtonGroup bg = new ButtonGroup();
	
	public ColorPanel() {
		
		setPreferredSize( new Dimension(300, 250) );
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		ColorPanel panel = new ColorPanel(); 
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JOptionPane.showMessageDialog(null, panel);
		}
}
