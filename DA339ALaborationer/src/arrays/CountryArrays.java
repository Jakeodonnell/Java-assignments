package arrays;

/**
 * Metorena nedan lagrar en endimitionell array i variabler, samt använder sig av for loopar 
 * för att räkna ut diverse olika saker så som arrayens, max, min och totatla värde med mera...
 * 
 * @param array
 * @return
 */

public class CountryArrays {

	/**
	 * toString metoden används för att skapa en sträng som retunerar värdena i den stil uppgiften angav.
	 * @param array
	 * @return
	 */
	
	public static String toString(Country [] array) {
		String str = "";
		for(int i = 0; i < array.length; i++) {
			str += array[i].toString() + ", ";
		}
		str = "{" + str.substring(0, str.length()-2) + "}";
		return str; 
	}

	/**
	 * indexOf metoden retunerar vid vilket index elementet (landet) ligger på i arrayn, finns inte landet retuneras -1.
	 * @param array
	 * @return
	 */
	public static int indexOf(Country[] array, Country country) {
		int arrayPos = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(country)) {
				arrayPos = i;
			}
		}
		return arrayPos;
	}

	/**
	 * Member metoden retunerar om länderna angivna finns med i Country arrayen
	 * om den finns med retuneras true annars false.
	 * @param array
	 * @param country
	 * @return
	 */
	public static boolean member(Country[] array, Country country) {

		boolean member = false;
		for(int i = 0; i < array.length; i++){
			if(array[i].equals(country)) {
				member = true;
			}
		}
		return member;
	}

	/**
	 * Metoden Max retunerar landet med högst population.
	 * @param array
	 * @return
	 */
	public static Country max(Country[] array) {
		Country max = array[0];

		for(int i = 0; i < array.length; i++) {
			if(max.compareTo(array[i]) < 0) {
				max = array [i];
			}
		}
		return max;
	}

	/** 
	 * Min retunerar landet med lägst population
	 * @param array
	 * @return
	 */
	public static Country min(Country[] array) {
		Country min = array[0];

		for(int i = 0; i < array.length; i++) {
			if(min.compareTo(array[i]) > 0) {
				min = array [i];
			}
		}
		return min;
	}
}
