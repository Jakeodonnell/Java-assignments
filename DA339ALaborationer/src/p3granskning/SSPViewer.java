package p3granskning;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**Klassen SSPViewer visar händelseförloppet i spelet såsom: Vem som vinner, poängutdelning och val av "vapen".
 * 
 * @author eriklundow
 *
 */
public class SSPViewer extends JPanel {

	//Variabler som används i klassen initieras.
	private Font font1 = new Font("Monospaced", Font.BOLD,18);
	private Font font2 = new Font("SansSeriff",Font.BOLD,16);

	private JLabel lblStat = new JLabel ("Nytt spel startat!",JLabel.CENTER);
	private JLabel lblUser = new JLabel ("User",JLabel.CENTER);
	private JLabel lblComputer = new JLabel ("Computer",JLabel.CENTER);
	private JLabel lblScoreU = new JLabel ("0",JLabel.CENTER);
	private JLabel lblScoreC = new JLabel ("0",JLabel.CENTER);
	private JLabel lblWeaponU = new JLabel ("",JLabel.CENTER);
	private JLabel lblWeaponC = new JLabel ("",JLabel.CENTER);
	
	private JPanel pnlTop = new JPanel(new GridLayout(1,3));
	private JPanel pnlBot = new JPanel(new GridLayout (3,2));

	//Klassens konstruktor sätter värden på variablers features och placerar dem på rätt plats i huvudpanelen.
	public SSPViewer () {
		//Val av huvudpanelens storlek samt layout.
		setPreferredSize(new Dimension ( 400	,400));
		setLayout ( new GridLayout(2,1));

		//Jlabels får storlek och typsnitt.
		lblStat.setPreferredSize(new Dimension(300,25));
		lblStat.setFont(font1);
		lblUser.setPreferredSize(new Dimension (300,25));
		lblUser.setFont(font2);
		lblComputer.setPreferredSize(new Dimension (300,25));
		lblComputer.setFont(font2);
		lblScoreU.setPreferredSize(new Dimension (300,25));
		lblScoreU.setFont(font1);
		lblScoreC.setPreferredSize(new Dimension (300,25));
		lblScoreC.setFont(font1);
		lblWeaponU.setPreferredSize(new Dimension (300,25));
		lblWeaponU.setFont(font2);
		lblWeaponC.setPreferredSize(new Dimension (300,25));
		lblWeaponC.setFont(font2);

		//JLabels placeras i respektive JPanel.
		pnlTop.add(lblStat,BorderLayout.CENTER);
		pnlBot.add(lblUser);
		pnlBot.add(lblComputer);
		pnlBot.add(lblScoreU);
		pnlBot.add(lblScoreC);
		pnlBot.add(lblWeaponU);
		pnlBot.add(lblWeaponC);
		
		//JPanels placeras i klassens huvud panel.
		add(pnlTop);
		add(pnlBot);


	}


	//Setters till klassens JLabels.
	
	
	//Spelarens poäng sätts
	public void setUserScore(String score) {

		lblScoreU.setText(score);

	}
	//Datorns poäng sätts.
	public void setCompScore(String score) {
		
		lblScoreC.setText(score);
		
	}

	//Aktuella händelser i spelet sätts
	public void setResult(String result) {
		lblStat.setText(result);

	}

	//Spelarens val av vapen anges
	public void setUserWeapon(ImageIcon image) {
		lblWeaponU.setIcon(image);

	}

	//Datorns val av vapen anges.
	public void setcompWeapon(ImageIcon image) {
		lblWeaponC.setIcon(image);

	}

}
