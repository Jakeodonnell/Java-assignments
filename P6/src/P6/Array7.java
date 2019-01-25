package P6;

/**
 * 
 * Array 7 creates an array which includes seven different elements. 
 * The elements saved in the array are all integers. 
 * The class contains several methods that are used to read and write single elements
 * as well as read and write all elements given in the array. 
 * The class also uses three different constructors. 
 * 
 * @author Marcus Nordström, Anna Klingberg Brondin, Stefan von Freytag-Loringhoven, 
 * Benjamin Jonsson Zakrisson, Sebastian Carlsson, Jake O´Donnell
 *
 */

public class Array7 {

	private int[] indexer;

	/**
	 * Constructor defines Arrat.toIntArray() as indexer
	 * @param Array7 Array
	 */

	public Array7(Array7 Array) {
		this.indexer = Array.toIntArray();
	}

	/**
	 * Constructor sets a one-dimentional array
	 * @param array
	 */

	public Array7(int[] array) {
		setArray(array);
	}
	/**
	 * Constructor for blank Array7
	 */
	public Array7() {
		indexer = new int[7];
	}

	/**
	 * Set element at pos
	 * @param pos, value
	 */

	public void setElement(int pos, int value) {
		indexer[pos] = value;
	}

	/**
	 * Get element at pos
	 * @param int pos
	 * @return int
	 */

	public int getElement(int pos) {
		return indexer[pos];
	}

	/**
	 * Get elemets in array
	 * @return Array.toIntArray
	 */

	public int[] getElements() {
		return this.indexer;
	}

	/**
	 * Set the array
	 * @param array
	 */

	public void setArray(int[] array) {
		this.indexer = array;
	}

	/**
	 * set array
	 * @param array
	 */

	public void setArray(Array7 array) {
		this.indexer = array.toIntArray();
	}

	/**
	 * New instance of Array7 is created and returned 
	 * @return Array7
	 */

	public Array7 getArray() {
		return new Array7(toIntArray());
	}
	
	/**
	 * An instance of int[] is returned
	 * @return int[]
	 */
	
	public int[] toIntArray() {
		return indexer.clone();
	}
	
	/**
	 * ToString is created which returns indexer at i in the array with a "space" between.
	 *  @return String
	 */
	
	public String toString() {
		String res = "";
		for(int i = 0; i < indexer.length; i++) {
			res += indexer[i] + " ";
		}
		return res;
	}

}
