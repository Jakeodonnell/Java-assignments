package arrays;

public class Integer2dArrays {

	/** 
	 * Metoden toString retunerar en toString metod för en tvådimensionell array.
	 * @param array
	 * @return
	 */
	public static String toString(int [][] array) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += "{"; 
			for (int o = 0; o < array[i].length; o++) {
				str += array[i][o] + ","; 
			}
			str = str.substring(0, str.length()-1); 
			str += "}" + ",";
		}
		str = str.substring(0, str.length()-1);
		return "{" + str + "}";
	}

	/**
	 * Metoden elements retunerar hur många element befinner sig i den tvådimensionella arrayen.
	 * @param array
	 * @return
	 */
	public static int elements(int[][] array) {
		int elements = 0;
		for(int i = 0; i < array.length; i++) {
			elements+= array[i].length;
//			for (int o = 0; o < array[i].length; o++) {
//				elements += 1;
//			}
		}
		return elements;
	}

	/**
	 * Max retunerar det största värdet i den tvådimensionella arrayen.
	 * @param array
	 * @return
	 */
	public static int max(int [][] array) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int o = 0; o < array[i].length; o++) {
				max = Math.max(array[i][o], max);
			}
		}
		return max;
	}

	/**
	 * Min retunerar minsta värdet i den tvådimensionella arrayen.
	 * @param array
	 * @return
	 */
	public static int min(int [][] array) {
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < array.length; i++) {
			for(int o = 0; o < array[i].length; o++) {
				min = Math.min(array[i][o], min);
			}
		}
		return min;
	}
	
	/**
	 * Sum retunerar summan av arrayen.
	 * @param array
	 * @return
	 */
	public static int sum(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int o = 0; o < array[i].length; o++) {
				sum += array[i][o];
			}
		}
		return sum;
	}
	
	/**
	 * Average retunerar arrayens medelvärde.
	 * @param array
	 * @return
	 */
	public static float average(int[][] array) {
		float sum = sum(array);
		float average = sum / elements(array);
		return average;
	}
}
