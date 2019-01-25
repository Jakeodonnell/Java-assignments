package laboration10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SurveyPanel extends JPanel{

	private JLabel jlnamn = new JLabel("Namn: ");
	private JLabel jlålder = new JLabel("Ålder: ");
	private JLabel jlhobby = new JLabel("Hobby: ");

	private JTextField jtf = new JTextField();

	private JPanel jpnorth = new JPanel(new BorderLayout());
	private JPanel jpnorthnorth = new JPanel(new BorderLayout());
	private JPanel jpnorthcenter = new JPanel(new GridLayout(1,2));
	private JPanel jpage = new JPanel(new GridLayout(5,1));
	private JPanel jphobby = new JPanel(new GridLayout(5,1));

	private JRadioButton jrb017 = new JRadioButton("0 - 17");
	private JRadioButton jrb1864 = new JRadioButton("18 - 64");
	private JRadioButton jrb65 = new JRadioButton("65 -");

	private JCheckBox jcbidrott = new JCheckBox("Idrott");
	private JCheckBox jcbfolkdans = new JCheckBox("Folkdans");
	private JCheckBox jcbfågelskådning = new JCheckBox("Fågelskådning");
	private JCheckBox jcbbridge = new JCheckBox("Bridge");
	private JCheckBox jcbkörsång = new JCheckBox("Körsång");

	private JButton jbsummary = new JButton("Sammanfattning");

	private JTextArea jtasummary = new JTextArea();

	public SurveyPanel() {

		setPreferredSize( new Dimension(300, 360) );
		setLayout ( new BorderLayout() );
		ButtonGroup group = new ButtonGroup();		

		//ålder
		jpage.setBorder(BorderFactory.createTitledBorder("hobby"));
		group.add(jrb017);
		group.add(jrb1864);
		group.add(jrb65);
		jpage.add(jrb017);
		jpage.add(jrb1864);
		jpage.add(jrb65);
		jrb65.setSelected(true);

		//hobby
		jphobby.setBorder( BorderFactory.createTitledBorder("Hobby"));
		jphobby.add(jcbidrott);
		jphobby.add(jcbfolkdans);
		jphobby.add(jcbfågelskådning);
		jphobby.add(jcbbridge);
		jphobby.add(jcbkörsång);

		//northnorth + northcenter
		jpnorthcenter.add(jpage);
		jpnorthcenter.add(jphobby);
		jpnorthnorth.add(jtf, BorderLayout.CENTER);
		jpnorthnorth.add(jlnamn, BorderLayout.WEST);

		//north
		jpnorth.add(jpnorthnorth, BorderLayout.NORTH);
		jpnorth.add(jpnorthcenter, BorderLayout.CENTER);
		jpnorth.add(jbsummary, BorderLayout.SOUTH);



		add( jpnorth, BorderLayout.NORTH );
		add( jtasummary, BorderLayout.CENTER );
		jbsummary.addActionListener(new SummaryListener());

	}
	
	private class SummaryListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			summary(); 

		}
	}


	public void summary() {
		String res = jtf.getText() + "\n";

		if( jrb017.isSelected() ) {
			res += "Ålder: " + "0 - 17 år\n";
		}

		else if( jrb1864.isSelected() ) {
			res += "Ålder: " + "18 - 64 år\n";
		}

		else {
			res += "Ålder: " + "65 - år\n";
		}
		res += "Hobby: ";
		if( jcbidrott.isSelected() ) {
			res += " Idrott";
		}
		if( jcbfolkdans.isSelected() ) {
			res += " Folkdans"; 
		}
		if( jcbfågelskådning.isSelected() ) {
			res += " Fågelskådning"; 
		}
		if( jcbbridge.isSelected() ) {
			res += " Bridge";
		}
		if( jcbkörsång.isSelected() ) {
			res += " Körsång"; res += "\n";
		}

		jtasummary.setText( res );
	}
}

