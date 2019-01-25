package P6;

import ExternalResources.Color;

/**
 * 
 * Array 7x7 includes 7 different Array 7's. In total this class gives us an array with 49 different elements.
 * The elements saved in the array are all integers. 
 * The class contains two different methods to read and write individual elements and also four different
 *  methods to read and write rows and columns. 
 *  Methods that read and write all of the elements are also found in this class. 
 * 
 * @author Marcus Nordström, Anna Klingberg Brondin, Stefan von Freytag-Loringhoven, 
 * Benjamin Jonsson Zakrisson, Sebastian Carlsson, Jake O´Donnell
 *
 */

public class Array7x7 {

	private int[][] charArray;

	/**
	 * Constructor
	 *
	 * @param charArray 
	 */
	
	public Array7x7(int[][] charArray) {
		this.charArray = charArray;
	}
	
	/**
	 * Constructor
	 * @param param
	 */
	
	public Array7x7(Array7x7 param) {
		this.charArray = param.toIntArray();
	}

	/**
	 * Constructor
	 * 
	 * 
	 */
	
	public Array7x7() {
		this.charArray = new int[7][7];
	}

	/**
	 * Get an element at a specific place in the array
	 * 
	 * @param row, col
	 * @return charArray[row][col]
	 */
	
	public int getElement(int row, int col) {
		return this.charArray[row][col];
	}

	/**
	 * Set a value at a specifik place in the array
	 * 
	 * @Param row, col, value
	 */
	
	public void setElement(int row, int col, int value) {
		this.charArray[row][col] = value;
	}

	/**
	 * Uses theRow as parameter to get elements from a Array7 and puts the in a row in array7x7
	 * @param row, theRow
	 */
	
	public void setRow(int row, Array7 theRow) {
		this.charArray[row] = theRow.getElements();
	}

	/**
	 * get the full row given in the Array7x7
	 * 
	 * @param row
	 * @return temp
	 */
	
	public Array7 getRow(int row) {
		Array7 temp = new Array7();
		for (int i = 0; i < charArray.length; i++) {
			temp.setElement(i, this.getElement(row, i));
		}
		return temp;
	}

	/**
	 * set the column of the current Array7x7
	 * 
	 * @param col, theCol
	 */
	
	public void setCol(int col, Array7 theCol) {

		for (int i = 0; i < theCol.toIntArray().length; i++) {
			charArray[i][col] = theCol.getElement(i);
		}
	}

	/**
	 * get the column of the current Array7x7
	 * 
	 * @param col
	 * @return Array7
	 */
	
	public Array7 getCol(int col) {
		Array7 temp = new Array7();
		for (int i = 0; i < charArray.length; i++) {
			temp.setElement(i, charArray[i][col]);
		}
		return temp;
	}

	/**
	 * sets a two-dimentional array
	 * 
	 * @param array
	 */
	
	public void setArray(int[][] array) {
		charArray = array;
	}

	/**
	 * sets the Array using a Array7x7
	 * 
	 * @param array
	 */
	
	public void setArray(Array7x7 array) {
		charArray = array.toIntArray();
	}

	/**
	 * An instance of int[][] is returned
	 * 
	 * @return int[][]
	 * 
	 */

	public int[][] toIntArray() {
		return this.charArray.clone();
	}

	/**
	 * get a copy of the current Array7x7
	 * 
	 * @return Array7x7
	 */
	
	public Array7x7 getArray() {
		return new Array7x7(charArray.clone());
	}

	/**
	 * Shift the entire array to the left, parameter is the rightmost col
	 * 
	 * @param inputCol
	 * @return temp
	 */
	
	public Array7 shiftLeft(Array7 inputCol) {
		Array7 temp = this.getCol(0);
		for(int i = 0; i < this.charArray.length; i++) {
			for(int j = 0; j < this.charArray[i].length - 1; j++) {
				this.charArray[i][j] = this.charArray[i][j+1];
			}
		}
		return temp;
	}
	
	/**
	 * shift the entire array to the left, parameter is the leftmost col
	 * 
	 * @param inputCol
	 * @return temp
	 */
	
	public Array7 shiftRight(Array7 inputCol) {
		Array7 temp = this.getCol(6);
		for(int i = 0; i < this.charArray.length; i++) {
			for(int j = 0; j < this.charArray[i].length - 1; j++) {
				this.charArray[i][j] = this.charArray[i][j+1];
			}
		}
		this.setCol(0, inputCol);
		return temp;
	}

	/**
	 * shift the entire array to the right, parameter is the rightmost col
	 * 
	 * @param right
	 */
	
	public void shiftLeftVoid(Array7 right) {
		Array7 temp = this.getCol(0);
		for(int i = 0; i < this.charArray.length - 1; i++) {
			setCol(i,getCol(i+1));
		}
		this.setCol(charArray.length - 1, right);
	}
	
	/**
	 * shift the entire array to the left, parameter is the leftmost col
	 * 
	 * @param left
	 */
	
	public void shiftRightVoid(Array7 left) {
		Array7 temp = this.getCol(6);
		for(int i = this.charArray.length - 1; i > 0 ; i--) {
			setCol(i, getCol(i-1));
		}
		this.setCol(0, left);
	}
	
	/**
	 * this method chechs if an element in the array is set to 1 or 0.
	 * if its set to one it makes that element black otherwise white.
	 * 
	 * @return temp
	 */
	
	public int[][] toColor() {
		int[][] temp = new int[charArray.length][charArray[0].length];
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[j][i] == 0)
					temp[j][i] = Color.WHITE;
				else if (charArray[j][i] == 1)
					temp[j][i] = Color.BLACK;
			}
		}
		return temp;
	}
}
