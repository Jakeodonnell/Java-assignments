package laboration14;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class NameProfession extends JPanel{
	
	private JPanel jpwest = new JPanel(new GridLayout (1,2));
	private JPanel jpcenter = new JPanel(new GridLayout (2,1));
	
	private JTextField jtnamn = new JTextField();
	private JTextField jtyrke = new JTextField();
	
	private JLabel jlnamn = new JLabel("namn");
	private JLabel jlprof = new JLabel("Yrke");
	
	public NameProfession() { 

		setPreferredSize(new Dimension(350,200));
		setLayout (new GridLayout(2,1));	
		
		add(jpwest);
		jpwest.add(jlnamn);
		jpwest.add(jtnamn);
		
		add(jpcenter);
		jpcenter.add(jlprof);
		jpcenter.add(jtyrke);
		
	}
	
	public String getName() {
		return jtnamn.getText();
	}
	
	public String getProfession() { 
		return jtyrke.getText();
	}
	
}
