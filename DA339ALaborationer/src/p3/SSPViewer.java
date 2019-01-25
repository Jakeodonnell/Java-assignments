package p3;

import java.awt.*;

import javax.swing.*;

public class SSPViewer extends JLabel {

	
	private JLabel jlrubrik = new JLabel("Först till 3 vinner");
//	private JLabel jlhuman = new JLabel("Human");
//	private JLabel jlcomputer = new JLabel("Computer");
//	private JLabel jlhumanscore = new JLabel("0");
//	private JLabel jlcomputerscore = new JLabel("0");
//	private JLabel jlvalhuman = new JLabel("");
//	private JLabel jlvalcomputer = new JLabel ("");
//	private JPanel jpgame = new JPanel(new GridLayout (1,2));
//	private JPanel jphuman = new JPanel(new GridLayout (3,1)); 
//	private JPanel jpcomputer = new JPanel(new GridLayout(3,1)); 
//	public static final int 	STEN = 1,
//						SAX = 2,
//						PÅSE = 3;

	public SSPViewer () {
		setPreferredSize(new Dimension(300,200));						//Viewer fönster skapas
		setLayout (new GridLayout(2,1));									//gridlayout skapas med två i sidled 
		
		//övre rubriks
		add(jlrubrik);													//JLabel läggs till och centreras
		jlrubrik.setHorizontalAlignment(CENTER);
		//undre resultat
//		add(jpgame);

		
//		jpgame.add(jphuman);												//Human resultat delas upp i 3 delar
//		jphuman.add(jlhuman);
//		jlhuman.setHorizontalAlignment(CENTER);
//		jphuman.add(jlhumanscore);
//		jlhumanscore.setHorizontalAlignment(CENTER);
//		jphuman.add(jlvalhuman);
//		jlvalhuman.setHorizontalAlignment(CENTER);
//
//			
//		jpgame.add(jpcomputer);											//Computer resultat delas upp i 3 delar
//		jpcomputer.add(jlcomputer);
//		jlcomputer.setHorizontalAlignment(CENTER);
//		jpcomputer.add(jlcomputerscore);
//		jlcomputerscore.setHorizontalAlignment(CENTER);
//		jpcomputer.add(jlvalcomputer);
//		jlvalcomputer.setHorizontalAlignment(CENTER);
//	}
//
//	public void startnewgame() {											//metoden som anger vad som sker när "startnewgame" kallas på i controller
//		jlrubrik.setText("Först till 3 vinner");
//		jlhumanscore.setText("0");
//		jlcomputerscore.setText("0");
//		jlvalhuman.setText("");
//		jlvalcomputer.setText("");
//	}
//	
//	public int getSten() {
//		return this.STEN;
//	}
//	
//	public int getSax() {
//		return this.SAX;
//	}
//	
//	public int getPåse() {
//		return this.PÅSE;
//	}
//
//	public void stensaxpase(int dittval, int datornsval) {		//metoden som anger vilkt val spelaren eller datorn har gjort i viewer fönstret
//
//		if(dittval == STEN) {
//			jlvalhuman.setText("Sten");
//		}
//
//		else if(dittval == SAX) {
//			jlvalhuman.setText("Sax");
//		}
//
//		else if(dittval == PÅSE) {
//			jlvalhuman.setText("Påse");
//		}
//		if (datornsval == STEN) {
//			jlvalcomputer.setText("Sten");
//		} 
//
//		else if(datornsval == SAX) {
//			jlvalcomputer.setText("Sax");
//		}
//
//		else if(datornsval == PÅSE) {
//			jlvalcomputer.setText("Påse");
//		}
//	}
//
//	public void score( int dinapoäng, int datorpoäng) {				//metoden uppdaterar resultatet som är angivet i controller samt ändrar rubrik när någon har vunnit
//
//		jlcomputerscore.setText(datorpoäng + "");
//
//		jlhumanscore.setText(dinapoäng + "");
//
//		if(datorpoäng == 3) {
//			jlrubrik.setText("Dator har vunnit!");
//			
//		}
//
//		if(dinapoäng == 3) {
//			jlrubrik.setText("Du vann!");
//			
//		}
	}
}
