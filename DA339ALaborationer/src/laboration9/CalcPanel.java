package laboration9;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener {
	private JLabel lblNbr1 = new JLabel( "Tal 1" );
	private Font fontLabels = new Font ( "SansSerif", Font.PLAIN, 18 );
	private JTextField tfNbr1 = new JTextField();
	private JLabel lblNbr2 = new JLabel( "Tal 2" );
	private JTextField tfNbr2 = new JTextField();
	private JButton btnAdd = new JButton( "+" );
	private Font fontButtons = new Font( "SansSerif", Font.PLAIN, 24 );
	private JButton btnSub = new JButton( "-");
	private JLabel lblResult = new JLabel ( "Resultat");

	public void actionPerformed ( ActionEvent e) {
		double nbr1, nbr2;
		String nbr1Str, nbr2Str, res;
		nbr1Str = tfNbr1.getText();
		nbr2Str = tfNbr2.getText();
		nbr1 = Double.parseDouble( nbr1Str ); 
		nbr2 = Double.parseDouble( nbr2Str ); 
		
			if( e.getSource() == btnAdd ) { 

				res = nbr1Str + " + " + nbr2Str + " = " + (nbr1 + nbr2);
				lblResult.setText( res );

			} else if( e.getSource() == btnSub ){

				res = nbr1Str + " - " + nbr2Str + " = " + (nbr1 - nbr2);
				lblResult.setText( res );
			}

		}

	


	public CalcPanel () {
		setPreferredSize( new Dimension (250, 105) );

		lblNbr1.setPreferredSize( new Dimension( 100, 20 ) );
		lblNbr1.setFont( fontLabels );
		tfNbr1.setPreferredSize( new Dimension( 100, 20 ) );

		lblNbr2.setPreferredSize( new Dimension( 100, 20 ) );
		lblNbr2.setFont( fontLabels );
		tfNbr2.setPreferredSize( new Dimension( 100, 20 ) );

		btnAdd.setPreferredSize( new Dimension( 100, 20 ) );
		btnAdd.setFont( fontButtons );

		btnSub.setPreferredSize( new Dimension( 100, 20));
		btnSub.setFont( fontButtons );
		
		lblResult.setPreferredSize(new Dimension(200, 20 ));
		lblResult.setFont( fontLabels );



		add( lblNbr1 );
		add( tfNbr1 );
		add( lblNbr2 );
		add( tfNbr2 );
		add( btnAdd );
		add( btnSub );
		add( lblResult );
		
		btnAdd.addActionListener( this );
		btnSub.addActionListener(this);
	}



}
