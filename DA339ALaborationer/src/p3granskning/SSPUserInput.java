package p3granskning;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JPanel;

/**
 * SSPUserInput visar ett fönster som innehåller alla val användare kan göra för att manipulera spelet.
 * @author eriklundow
 *
 */

public class SSPUserInput extends JPanel implements  ActionListener{

	//Klassens variabler dokumenteras.

	private SSPController controller;
	private JPanel pnlTop = new JPanel(new GridLayout(1,3));
	private JPanel pnlMid = new JPanel (new GridLayout(1,1));
	private JPanel pnlBot = new JPanel (new GridLayout(1,1));

	private JButton btnRock = new JButton ("Sten");
	private JButton btnScissor = new JButton ("Sax");
	private JButton btnPaper = new JButton ("Påse");
	private JButton btnNewGame = new JButton ("Nytt Spel");
	private JButton btnEndGame = new JButton ("Avsluta");

	//Klassens konstruktor innhåller en referens till klassen SSPController.
	public SSPUserInput(SSPController Controller) {
		this.controller=Controller;
		this.controller.setUserInput( this );

		//Listeners läggs till i konstruktorn.
		addListener();

		//Huvudpanelens storlek och layout anges.
		setPreferredSize ( new Dimension (500,200));
		setLayout (new GridLayout(3,1));


		//JButtons får repsektive storlek
		btnRock.setPreferredSize(new Dimension (75,50));
		btnScissor.setPreferredSize(new Dimension (75,50));
		btnPaper.setPreferredSize(new Dimension (75,50));
		btnNewGame.setPreferredSize(new Dimension (225,50));
		btnEndGame.setPreferredSize ( new Dimension (225,50));


		//JButtons läggs in i repektive JPanel
		pnlTop.add(btnRock);
		pnlTop.add(btnScissor);
		pnlTop.add(btnPaper);
		pnlMid.add(btnNewGame);
		pnlBot.add(btnEndGame);

		//JPanels läggs in i huvudpanelen
		add(pnlTop,BorderLayout.NORTH);
		add(pnlMid,BorderLayout.CENTER);
		add(pnlBot,BorderLayout.SOUTH);

		//Anropar metoden playMusic() i klassen SSPController, musik startas.
		controller.playMusic();
	}

	//Aktiverar knappar med val av vapen
	public void enableButtons(){
		btnRock.setEnabled(true);
		btnScissor.setEnabled(true);
		btnPaper.setEnabled(true);
	}

	//Avavktiverar val av vapen
	public void disableButtons() {
		btnRock.setEnabled(false);
		btnScissor.setEnabled(false);
		btnPaper.setEnabled(false);

	}

	//JButtons får referens till listeners
	public void addListener() {
		btnRock.addActionListener(this);
		btnScissor.addActionListener(this);
		btnPaper.addActionListener(this);
		btnNewGame.addActionListener(this);
		btnEndGame.addActionListener(this);
	}


	//Händelsehantering
	public void actionPerformed(ActionEvent e) {
		//Varje JButton  har en respektive händelse som ska utföras vid aktivering. 
		//Metoder anropas genom referens till controllerklassen.

		if(e.getSource()==btnRock) {
			controller.setUserWeapon(SSPController.Rock);
			controller.setComputerWeapon();

		}
		if(e.getSource()==btnScissor) {
			controller.setUserWeapon(SSPController.Scissor);
			controller.setComputerWeapon();

		}

		if(e.getSource()==btnPaper) {
			controller.setUserWeapon(SSPController.Paper);
			controller.setComputerWeapon();

		}

		if(e.getSource()==btnNewGame) {
			controller.newGame();
		}

		if (e.getSource()==btnEndGame) {
			controller.ExitGame();
		}

	}





}


