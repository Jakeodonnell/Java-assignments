/*
 * Klassen innehåller metoder för att sortera och hantera en array fylld med int.
 * @author Mikael Lindfors den 16/11-2017
 * 
 **/

package arraysgranskning;

public class IntegerArrays
{
	int[] myArray;

	/*
	 * Metod som lägger ihop alla värden i arrayen och sparar det i en String Som
	 * returneras.
	 */

	public static String toString(int[] array)
	{
		String sum = "{";
		for (int i = 0; i < array.length; i++)
		{
			// Kontrollerar så att det inte är sista värdet i arrayen.
			if (i + 1 != array.length)
				sum = sum + array[i] + ",";
			else
				sum = sum + array[i] + "}";
		}
		return sum;
	}

	/* 
	 * Metod som letar upp det största talet och returnerar det.
	 */
	public static int max(int[] array)
	{
		int max = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (max < array[i])
			{
				max = array[i];
			}
		}
		return max;
	}

	/*
	 * Metod som letar upp minsta talet och returnerar det.
	 */
	public static int min(int[] array)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++)
		{
			if (min > array[i])
			{
				min = array[i];
			}
		}
		return min;
	}

	/*
	 * Returnerar summan av alla tal i arrayen.
	 */
	public static int sum(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}

	/*
	 * Metod som räknar ut medelvärdet av alla tal i arrayen.
	 */
	public static double average(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		return (double) sum / array.length;
	}

	/*
	 * Metod som räknar ut mellanskillnaden mellan största och minsta talet i
	 * arrayen och returnerar resultatet.
	 */
	public static int range(int[] array)
	{
		return max(array) - min(array);
	}

	/*
	 * Metod som sorterar arrayen i storleksordning. Stigande ordning.
	 */
	public static void sortAsc(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				// Jämför array[i] med alla array[j]. Om något värde är större än array[i] så
				// byt position på värdena
				if (array[i] < array[j])
				{
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
	}

	/*
	 * Metod som sorterar arrayen i storleksordning. Minskande ordning.
	 */
	public static void sortDesc(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				// Jämför array[i] med alla array[j]. Om något värde är mindre än array[i] så
				// byt position på värdena
				if (array[i] > array[j])
				{
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/*
	 * Metod som skapar en ny kopia av inkommande array och kopierar över alla
	 * värden till den nya arrayen.
	 */
	public static int[] copy(int[] array)
	{

		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			newArray[i] = array[i];
		}
		return newArray;
	}

	/*
	 * Metod som räknar ut medianen av en array
	 */

	public static int median(int[] array)
	{
		int[] newArray;
		int sum;
		newArray = copy(array);
		sortAsc(newArray);
		//Kontrollerar om antal element i arrayen är jämnt antal. Isåfall returneras medelvärdet av de 2 mittersta talen
		if (newArray.length % 2 == 0)
		{
			sum = newArray[newArray.length / 2] + newArray[(newArray.length / 2) + 1];
			return sum / 2;
		} 
		else //Ojämnt antal element i arrayen. Returnerar mittenvärdet.
		{
			return newArray[newArray.length / 2];
		}

	}

	/*
	 * Mode-metod som ej fungerar. (Ej obligatorisk)
	 * 
	 * public static int mode (int [] array) 
	 * { 
	 * 		int [][] newArray = new
	 * 		int[array.length][2]; 
	 * 		int [] counter = new int[array.length]; 
	 * 		int pos = 0;
	 * 		int sum; 
	 * 		int tmp = 0; 
	 * 		for (int i=0;i<array.length;i++) 
	 * 		{ 
	 * 			sum = 0; 
	 * 			pos = 0;
	 * 			boolean test = false; 
	 * 			tmp = array[i]; 
	 * 			for (int j=0;j<array.length;j++) 
	 * 			{ 	
	 * 				if (tmp == array[j]) 
	 * 				{
	 * 					sum++;
	 * 	 * 			} 
	 * 			}
	 * 			if (newArray[i][1])
	 * 			{ 
	 * 				if (sum > 1 ) 
	 * 				{
	 * 					newArray[i][0] = tmp; 
	 * 					newArray[i][1] = sum;
	 * 	 * 
	 * 				} 
	 * 				else 
	 * 				{ 
	 * 					newArray[i][0] = tmp; 
	 * 					newArray[i][1]++; 
	 * 				}
	 * 			} 
	 * 		return 0; 
	 * }
	 * 
	 */

}
