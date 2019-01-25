package laboration9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FCConverterPanel extends JPanel implements ActionListener{

	private JLabel lblgrader = new JLabel("Grader");
	private JLabel lblresults = new JLabel( "Resultat:");
	private JTextField anggrader = new JTextField();
	private JButton tofaren = new JButton("Till Fahrenheit");
	private JButton toCels = new JButton("Till Celsius");
	private JButton avsluta = new JButton("Avsluta");

	private Font allfont = new Font ("SanSerif", Font.BOLD, 10);

	public FCConverterPanel() {
		setPreferredSize( new Dimension (250, 105) );

		lblgrader.setPreferredSize(new Dimension(50, 20));
		lblgrader.setFont(allfont);

		anggrader.setPreferredSize(new Dimension(150,20));

		lblresults.setPreferredSize(new Dimension(205,20));
		lblresults.setFont(allfont);

		tofaren.setPreferredSize(new Dimension(100, 20));
		tofaren.setFont(allfont);

		toCels.setPreferredSize(new Dimension(100,20));
		toCels.setFont(allfont);

		avsluta.setPreferredSize(new Dimension(200, 20));
		avsluta.setFont(allfont);



		add( lblgrader );
		add( anggrader );
		add( lblresults );
		add( tofaren );
		add( toCels );
		add( avsluta );

		toCels.addActionListener(this);
		tofaren.addActionListener(this);
		avsluta.addActionListener(this);
	}

	public void actionPerformed( ActionEvent e) {
		Double grader, res;
		String graderStr;

		if( e.getSource() == tofaren ) {
			grader = Double.parseDouble(graderStr = anggrader.getText());
			res = 32 + 1.8*grader;
			graderStr = res + "F";
			lblresults.setText( graderStr );

		} else if( e.getSource() == toCels ) {
			grader = Double.parseDouble(graderStr = anggrader.getText());
			res = (grader - 32)/1.8;
			graderStr = res + "C";
			lblresults.setText( graderStr ); 

		} else if( e.getSource() == avsluta ) { 
			System.exit( 0 );
		}
	}
}
