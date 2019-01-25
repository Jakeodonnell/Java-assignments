package P6;

import java.util.Random;

import ExternalResources.Color;

/**
 * 
 * Controller modifies array7 and array7x7 based on the chosen UserInterface.
 * 
 * @author  Marcus Nordström, Anna Klingberg Brondin, Stefan von Freytag-Loringhoven, 
 * Benjamin Jonsson Zakrisson, Sebastian Carlsson, Jake O´Donnell
 * 
 */

public class Controller {
	private Test1_UI ui;
	private Test2_UI ui2;
	private charArchive chars = new charArchive();
	private Random rng = new Random();
	private Array7x7 array;
	private Array7 leftColumn;
	private Array7 bottomRow;
	private Array7 rightCol;
	private Array7 leftCol;

	/**
	 * Constructor creates new instances of objects.
	 */

	public Controller() {
		array = new Array7x7();
		leftColumn = new Array7();
		bottomRow = new Array7();
		leftCol = new Array7();
		rightCol = new Array7();
	}

	/**
	 * uppdates refferens to Test1_UI
	 * 
	 * @param ui
	 */

	public void setUI(Test1_UI ui) {
		this.ui = ui;
	}

	/**
	 * uppdates refferens to Test2_UI
	 * 
	 * @param ui
	 */

	public void setUI(Test2_UI ui) {
		this.ui2 = ui;
	}

	/**
	 * method returns array7x7
	 * 
	 * @return array7x7
	 */

	public Array7x7 getArray7x7() {
		return this.array;
	}

	/**
	 *This method creates an Array7 of the chosen integers in the bottom row of the user interface.  
	 *The Array7 is then implemented in the Array7x7 on the chosen row of the inparrameter. 
	 * @param row
	 */

	public void setRow(int row) {
		bottomRow.setArray(ui.getBottomRow());
		array.setRow(row, bottomRow);
	}

	/**
	 * This method creates an Array7 of the chosen integers in the far left column of the user interface.  
	 * The Array7 is then implemented in the Array7x7 on the chosen column of the in-parameter. 
	 * @param col
	 */

	public void setCol(int col) {
		leftColumn.setArray(ui.getLeftCol());
		array.setCol(col, leftColumn);
	}

	/**
	 * This method reads the row given as in-parameter from the Array7x7 and creates a one-dimensional array7 of the given row. 
	 * The array7 is then implemented in the row where integers are written. 
	 * 
	 * @param row
	 */

	public void getRow(int row) {
		bottomRow = array.getRow(row);
		ui.setBottomRow(bottomRow.toIntArray());
	}

	/**
	 * This method reads the column given as in-parameter from the Array7x7 and creates a one-dimensional array7 of the given column. 
	 * The array7 is then implemented in the column where integers are written. 
	 * 
	 * @param col
	 */

	public void getCol(int col) {
		leftColumn = array.getCol(col);
		ui.setLeftCol(leftColumn.toIntArray());
	}

	/**
	 * This method creates random integers in all elements of a array7x7
	 * 
	 */

	public void random_7x7() {
		int[][] temp = new int[7][7];
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				temp[j][i] = rng.nextInt(10);
			}
		}
		array.setArray(temp);
	}

	/**
	 * method shifts columns to the right
	 * @param right
	 */

	public void shiftLeft(Array7 right) {
		ui2.setLeft(array.getCol(0));
		array.shiftLeftVoid(right);
	}

	/**
	 * methods shifts columns to the left
	 * @param left
	 */

	public void shiftRight(Array7 left) {
		ui2.setRight(array.getCol(6));
		array.shiftRightVoid(left);
	}

	public void shiftCharLeft(int index) {

	}

	public void shiftCharRight(int index) {

	}

}

