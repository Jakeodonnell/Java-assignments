package p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SSPUserInput extends JPanel implements ActionListener{

	ImageIcon påse = new ImageIcon("images/påse.png");
	ImageIcon sten = new ImageIcon("images/sten.png");
	ImageIcon sax = new ImageIcon("images/sax.png");
	private SSPController controller;
	private JButton jbsten = new JButton(sten);
	private JButton jbsax = new JButton(sax);
	private JButton jbpåse = new JButton(påse);
	private JButton jbnyttspel = new JButton("Nytt Spel");
	private JButton jbavsluta = new JButton("Avsluta");
	private JPanel jpval = new JPanel(new GridLayout (1,3));
	public final int 	STEN = 1,
						SAX = 2,
						PÅSE = 3;
	 
 
	public SSPUserInput(SSPController controller) {
	
		setPreferredSize(new Dimension (300,200));	//fönstret storlek skapas nedan
		setLayout(new GridLayout(3,1));				//skapar en gridlayout så vi kan plasera våra knappar som angivet i uppgiften 3 plaseringar undervarandra och en i sidled
		
		this.controller = controller;				//variablen som används för att refferera till denna construktorn

		add(jpval);									//JPanel skapas med en layout på 1 till 3 så knapparna kommer bredvidvarandra horisontalt
		jpval.add(jbsten);
		jpval.add(jbsax);
		jpval.add(jbpåse);

		add(jbnyttspel);								//JButton avsluta och starta nytt spel skapas i 
		add(jbavsluta);

		jbsten.addActionListener(this);				//lyssnare som säger till om någon utav nedanstående knappar har blivit tryckta
		jbsax.addActionListener(this);
		jbpåse.addActionListener(this);
		jbavsluta.addActionListener(this);
		jbnyttspel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

													// nedan följer en metod som beskriver vad som skall hända för diverse olika knapptryck
		if(e.getSource() == jbsten) {
			controller.stensaxpase(STEN);
		}

		if(e.getSource() == jbsax) {
			controller.stensaxpase(SAX);
		}

		if(e.getSource() == jbpåse) {
			controller.stensaxpase(PÅSE);
		}

		else if(e.getSource() == jbnyttspel) {
			controller.nyttspel();
		}

		else if(e.getSource() == jbavsluta) {
			controller.avsluta();
		}
	}
}