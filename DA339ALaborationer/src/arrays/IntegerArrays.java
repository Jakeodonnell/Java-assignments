package arrays;

import java.util.Arrays;

public class IntegerArrays {

	/**
	 * toString metoden används för att skapa en sträng som retunerar värdena i den stil uppgiften angav.
	 * @param array
	 * @return
	 */
	public static String toString(int[] array) {
		String res = "{";
		for (int i: array) { 
			res += i;
			res += ",";
		}
		res = res.substring(0, res.length()-1) + "}";
		return res;
	}
 
	/**
	 * Metoden Max retunerar det högsta värdet hittat i arrayen
	 * @param array
	 * @return
	 */
	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int i: array) {
			if(i > max) {
				max = i; 
			}
		}
		return max;
	}

	/**
	 * Metoden min retunerar det lägsta värdet hittat i arrayen.
	 * @param array
	 * @return
	 */
	public static int min(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i: array) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}

	/**
	 * Sum retunerar suman av alla vrden i arrayen.
	 * @param array
	 * @return
	 */
	public static int sum(int [] array) {
		int sum = 0;
		for(int i: array) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Average retunerar ett värde av typen double som visar på medelvärdet av 
	 * alla värdena i arrayen.
	 * @param array
	 * @return
	 */
	public static double average(int [] array) {
		double sum = sum(array);
		double average = sum / array.length;
		return average;
	}
	
	/**
	 * Range retunerar värdet från det minsta talet till det största.
	 * @param array
	 * @return
	 */
	public static int range(int [] array) {
		int range = 0;
		range += max(array) - min(array);
		return range;
	}

	/**
	 * sortAsc sorterar arrayen på så sött att lägst värde hamnar längst åt vänster samt högsta längs åt höger.
	 * @param array
	 */
	public static void sortAsc(int [] array) {
		Arrays.sort(array);
	}

	/**
	 * sortDesc sorterar arrayen på så sätt att den utgår från sortAsc men vänder sedan på den och går baklänges,
	 * detta gör att arrayen sorteras från lägst till högst, vänster till höger, istället.
	 * @param array
	 */
	public static void sortDesc(int [] array) {
		int[] ascArray = copy(array);
		sortAsc(ascArray);
		int counter = 0;
		for(int i = array.length - 1; i >= 0; i -- ) {
			array[i] = ascArray[counter];
			counter++; 
		}
	}

	/**
	 * copy retunerar en kopia av arrayen.
	 * @param array
	 * @return
	 */
	public static int[] copy(int[] array) {
		int [] copy = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		
		return copy;
	}

}


