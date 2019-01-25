package p3granskning;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * SSPController sköter all kommunikation mellan resterande klasser. 
 * Ser till att spelets gång sker som det ska.
 * @author eriklundow
 *
 */
public class SSPController extends JFrame{
	//Klassens variabler initieras.


	public static final int Rock =0;
	public static final int Scissor=1;
	public static final int Paper=2;

	private ImageIcon rock = new ImageIcon ("images/sten.png");
	private ImageIcon paper = new ImageIcon ("images/papper.png");
	private ImageIcon scissor = new ImageIcon ("images/sax.png");
	private ImageIcon image;

	private Sound swishFX = Sound.getSound("sound/swishFX.wav");
	private Sound winFX = Sound.getSound("sound/winFX.wav");
	private Sound lostFX = Sound.getSound("sound/lostFX.wav");
	private Sound music = Sound.getSound("sound/STPMusic.wav");


	private SSPUserInput userInput;
	private SSPViewer view;
	private SSPPlayer player;

	private String score="";
	private String result="";

	private int userChoice;
	private int compChoice;

	private int uScore=0;
	private int cScore=0;



	//Klassens konstruktor innehåller referenser till SSPlayer och SSPViewer.
	public SSPController(SSPPlayer player, SSPViewer viewer) {
		this.view = viewer;
		this.player = player;


	}

	//En metod som sätter användarens val av vapen.
	public void setUserWeapon(int userChoice) {
		this.userChoice=userChoice;


		swishFX.setStarted(false);
		//Ljudeffekt vid knapptryckning.
		swishFX.play();

		//If sats ger variabeln image en referens till en bild utefter vilket val av vapen som har gjorts.
		if (userChoice==SSPController.Rock) {
			image=rock;}
		if (userChoice==SSPController.Scissor) {
			image=scissor;}
		if	(userChoice==SSPController.Paper) {
			image = paper;}

		//Bild som representerar val av vapen sätts i en metod i klassen SSPViewer.
		view.setUserWeapon(image);

	}

	//Metoden sätter datorns val av vapen
	public void setComputerWeapon() {

		//Hämtar ett slumpat värde, 0-2.
		compChoice=player.newChoice();

		//Värdet motsvarar en bild av valt vapnet som refereras till variabeln image.
		if	(compChoice==SSPController.Paper) {
			image = paper;}

		if (compChoice==SSPController.Rock) {
			image=rock;}
		if (compChoice==SSPController.Scissor) {
			image=scissor;}

		//Val av vapen sätts i en metod i klassen SSPViewer
		view.setcompWeapon(image);

		//Metoden rules anropas
		rules();
	}

	//rules ser till att vardera spelare får poäng vid rätt tillfälle.
	public void rules() {

		//Vinner användaren ett slag registreras en poäng.
		if(userChoice==Rock && compChoice==Scissor
				||userChoice==Scissor && compChoice==Paper
				||userChoice==Paper && compChoice==Rock) {
			uScore++;
			view.setResult("Poäng till User");
			score=String.valueOf(uScore);
			view.setUserScore(score);

		}

		//Vinner datorn ett slag registreras en poäng.
		else if(compChoice==Rock && userChoice==Scissor
				||compChoice==Scissor && userChoice==Paper
				||compChoice==Paper && userChoice==Rock) {
			cScore++;
			score=String.valueOf(cScore);
			view.setCompScore(score);	
			view.setResult("Poäng till Computer");
		}

		//annars registereras ingen poäng.
		else {view.setResult("Ingen poäng");}

		
		//Om tre poäng har uppnåtts deklareras en vinnare och knappval deaktiveras
		
		if(uScore==3) {
			result="User är vinnare!";
			view.setResult(result);
			userInput.disableButtons();
			winFX.play();
		}


		if(cScore==3) {
			result="Computer är vinnare!";
			view.setResult(result);
			userInput.disableButtons();
			lostFX.play();
		}
	}

	//Metoden newGames anropas vid tryck på knappen "Nytt Spel"
	public void newGame() {
		//Värden nollställs.
		view.setUserWeapon(null);
		view.setcompWeapon(null);
		view.setResult("Nytt spel startat!");
		view.setUserScore(String.valueOf(0));
		view.setCompScore(String.valueOf(0));

		uScore=0;
		cScore=0;
		
		//Knappar aktiveras
		userInput.enableButtons();

	}
	
	//Vid tryck på knappen "Avsluta" stängs fönstren och programmet avslutas.
	public void ExitGame() {
		System.exit(0);
	}
	
	//En referens till klassen SSPUserInput skapas
	public void setUserInput(SSPUserInput sspUserInput) {
		this.userInput=sspUserInput;
	}


	//Bakgrundsmusik startas
	public void playMusic() {
		music.play();		
	}






}
