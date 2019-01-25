package p3;

import java.awt.Color;

public class SSPController {

	private SSPViewer viewer;
	private SSPPlayer player;
	private SSPUserInput input;
	private int dinapoäng = 0;
	private int datorpoäng = 0;
	private int datorval;

	
	
	
	//en konstruktor, här implementeras parrametrarna angivna i "SSPRun" vilka är "SSPViewer" och "SSPPlayer"
	public SSPController(SSPPlayer player, SSPViewer viewer) {		
		this.viewer = viewer;
		this.player = player;
	}

	//en konstruktor, här implementeras parrametrarna angivna i "SSPRun" vilket är "SSPController" som inehåller "SSPViewer" och "SSPPLayer"
	public void setUserInput(SSPUserInput input) {					
		this.input = input;
		
	}
	
	//metod som avslutar programmet om knappen avsluta trycks in
	public void avsluta() {											
		System.exit(0);
	}

	// metod som återställer våra score och kallar på viewer.startnewgame vilket återställer all text i viewer till det ursprungliga då inget drag har gjorts.
	public void nyttspel() {											
		dinapoäng = 0;
		datorpoäng = 0;
		viewer.startnewgame();
		
	}
	
	
 
	// regler på vad som skall hända då diverse olika knappar är tryckta. detta är alla spelets regler vars resultat skickas vidare till viewer.
	public void stensaxpase(int dittval) {						
		
		if ((datorpoäng < 3) && (dinapoäng < 3)) {
			
			datorval = player.newChoise();
			
			if(dittval == SSPViewer.STEN) {
				viewer.stensaxpase(dittval, datorval);
			}
			if(dittval == SSPViewer.SAX) {
				viewer.stensaxpase(dittval, datorval);
			}
			if(dittval == SSPViewer.PÅSE) {
				viewer.stensaxpase(dittval, datorval);
			}

			if((dittval == SSPViewer.STEN) && (datorval == SSPViewer.SAX))  {
				dinapoäng ++;
				viewer.score(dinapoäng, datorpoäng);
			}

			if((dittval == SSPViewer.SAX) && (datorval == SSPViewer.STEN)) {
				datorpoäng ++;
				viewer.score(dinapoäng, datorpoäng);
			}

			if((dittval == SSPViewer.PÅSE) && (datorval == SSPViewer.STEN)) {
				dinapoäng ++;
				viewer.score(dinapoäng, datorpoäng);
			}
			
			if((dittval == SSPViewer.STEN) && (datorval == SSPViewer.PÅSE)) {
				datorpoäng +=1;
				viewer.score(dinapoäng, datorpoäng);
			}

			if((dittval == SSPViewer.PÅSE) && (datorval == SSPViewer.SAX)) {
				datorpoäng ++;
				viewer.score(dinapoäng, datorpoäng);
			}
			if((dittval == SSPViewer.SAX) && (datorval == SSPViewer.PÅSE)) {
				dinapoäng ++;
				viewer.score(dinapoäng, datorpoäng);
			}
		}
	}
}
