package P6;

import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ExternalResources.Color;
import ExternalResources.ColorDisplay;

/**
 * Flowingtext lets the user enter a text string, this input is then used to show 
 * several character floating across the screen from right to left 
 * 
 * @author Marcus Nordström, Anna Klingberg Brondin, Stefan von Freytag-Loringhoven, 
 * Benjamin Jonsson Zakrisson, Sebastian Carlsson, Jake O´Donnell
 *
 */

public class FlowingText extends JPanel {

	private Array7x7[] flow;
	private String userInput;
	private charArchive archive;
	private Timer t;
	private ColorDisplay cd;
	private textFlow tf;
	private int gridSize = 3;
	
	/**
	 * Constructor for the class that lets the user input text and converts the text
	 * into an Array7x7 array and also schedules the textFlow class.
	 */
	
	public FlowingText() {
		archive = new charArchive();
		t = new Timer();
		cd = new ColorDisplay(1, gridSize, Color.WHITE, Color.BLACK);
		userInput = JOptionPane.showInputDialog("Enter text");
		userInput = userInput.toUpperCase();
		switch (userInput.length()) {
		case 1: {
			userInput += "   ";
			break;
		}
		case 2: {
			userInput += "  ";
			break;
		}
		default: {
			userInput += " ";
		}
		}
		this.flow = new Array7x7[userInput.length()];
		for (int i = 0; i < userInput.length(); i++) {
			flow[i] = archive.returnLabel(userInput.charAt(i));
		}
		tf = new textFlow(flow);
		t.schedule(tf, 75, 75);
		System.out.println(userInput);
		add(cd);
	}

	public ColorDisplay getcd() {
		return cd;
	}

	private class textFlow extends TimerTask {
		Array7x7[] mArray;
		Array7x7 display = archive.returnLabel(' ');
		Array7x7[] displayArr = null;
		int charIndex = 0;
		int index = 0;
		
		/**
		 * Constructor for the timer class used to simply take in the characters
		 * from the userInput and and place them in the display array using the 
		 * setupDisplay function.
		 * @param param
		 */
		
		public textFlow(Array7x7[] param) {
			this.mArray = param;
			displayArr = new Array7x7[3];
			setupDisplay();
		}

		/**
		 * Just a quick setup function to set the first three characters in the display
		 * array in the beginning of the run to avoid nullPointerException.
		 */
		
		public void setupDisplay() {
			int[][] temp = new int[7][7];
			Array7x7 tempArr;
			if (mArray.length > displayArr.length) {
				for (int i = 0; i < displayArr.length; i++) {
					temp = mArray[i].toColor();
					displayArr[i] = new Array7x7(temp);
				}
			}
		}

		/**
		 * This function is used when the grid is set to 7x7 to have a flowing text with
		 * parameter text. 
		 * But not currently being used for the assignment.
		 */
		
		public void flowLeft7x7() {
			if (charIndex == mArray.length)
				charIndex = 0;
			display.shiftLeft(display.getCol(0));
			display.setCol(6, mArray[charIndex].getCol(index));
			if (charIndex != mArray.length) {
				if (index != 6)
					index++;
				else if (index == 6 && charIndex != mArray.length) {
					index = 0;
					charIndex++;
				}
			}
			cd.setDisplay(display.toColor());
			cd.updateDisplay();
		}

		/**
		 * This function is used to have a flowing text on a 7x21 grid. It uses
		 * shiftLeft to move what is currently showed to the left and then sets the last
		 * column in the 7x21 Array depending on what charIndex and index is at the
		 * moment.
		 * 
		 * Index increments every time the function is being called and resets when it
		 * reaches 6 back to 0.
		 * 
		 * charIndex increments every time index reaches 6 and resets once it reaches
		 * mArray.length which is the length of the userInput
		 */
		
		public void flowLeft7x21() {
			if (charIndex == mArray.length)											//	RESETS charIndex back to 0
				charIndex = 0;														//	If it reaches the last char in the Array.
			
			for (int i = 0; i < displayArr.length; i++) {							//	A for loop that runs through 3 times since the gridSize is 3
				displayArr[i].shiftLeft(mArray[i].getCol(0));						//	And shifts every respective grid to the left and checks
				if (i != displayArr.length - 1)										//	If index i is not equal to 2 with 0 based index.
					displayArr[i].setCol(6, displayArr[i + 1].getCol(0));			//	Then set the column you just shifted from the grid ahead of it.
			}
			displayArr[2].setCol(6, mArray[charIndex].getCol(index).getArray());	//	And then places the new column at the very end of the display array using mArray
																					//	and the current charIndex and the index.
				
			if (charIndex != mArray.length) {										//	Safety check to see as long the charIndex is not at the end of the character array.
				if (index != 6) {													//	Also as long as its not at index 6 then
					index++;														//	The index will increment.
				} else if (index == 6 && charIndex != mArray.length) {				//	Else if the index is at 6 and also charIndex is no at the end of the character array.
					index = 0;														//	Then reset index back to 0 
					charIndex++;													//	And also increment the charIndex to get the next character from the character array.
				}
			}
			for (int j = 0; j < gridSize; j++) {									//	A for loop that runs 3 times to use ColorDisplay that we got from our teacher.
				cd.setDisplay(displayArr[j].toColor(), 0, j);						//	setDisplay has 3 arguments (int[][] color, verticalPage, horizontalPage)
			}																		//	So in our case we have it with the gridSize 3, so it will display each respective grid's letter.
			cd.updateDisplay();														//	And then updateDisplay to just update the current display so it will update.
		}

		public void run() {
			flowLeft7x21();
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("");
				frame.setPreferredSize(new Dimension(1000, 400));
				// frame.getContentPane().setBackground(toColor(WHITE));
				// frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new FlowingText());
				frame.pack();
				frame.setVisible(true);
			}
		});
	}

}
