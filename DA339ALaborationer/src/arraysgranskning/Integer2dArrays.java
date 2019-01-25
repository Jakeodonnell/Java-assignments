/*
 * Klassen innehåller metoder för att sortera och hantera en 2dimesionell array fylld med int.
 * @author Mikael Lindfors den 16/11-2017
 * 
 **/

package arraysgranskning;

public class Integer2dArrays
{

	/*
	 * Metod som går igenom en 2-dimesionell array och lagrar värdena i en String.
	 * 
	 */
	public static String toString(int[][] array)
	{
		String sum = "";
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + "{"; 

			for (int j = 0; j < array[i].length; j++)
			{

				// Kontrollerar så att det inte är sista värdet i arrayen
				if (j != array[i].length - 1)
				{
					sum = sum + array[i][j] + ",";
				} else 
				{
					sum = sum + array[i][j];
				}
			}
			if (i == array.length - 1) // Kontrollerar så att det inte är sista värdet i arrayen
			{
				sum = sum + "}";
			} else
			{
				sum = sum + "},";
			}
		}
		return sum;
	}

	/*
	 * Metod som räknar antal element i arrayen och returnerar antalet.
	 */

	public static int elements(int[][] array)
	{
		int counter = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				counter++;
			}
		}
		return counter;
	}

	/*
	 * Metod som letar upp det största talet och returnerar det.
	 */
	public static int max(int[][] array)
	{
		int max = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				// Jämför om max är mindre än värdet i arrayen. Om så är fallet, sätt
				// arrayvärdet till nya max.
				if (max < array[i][j])
				{
					max = array[i][j];
				}
			}
		}
		return max;
	}

	/*
	 * Metod som letar upp minsta talet och returnerar det.
	 */
	public static int min(int[][] array)
	{
		// min sätts till största värdet.
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				// Kontrollerar om min är större än värdet i arrayen. Om så är fallet, sätt
				// arrayvärdet till nya min.
				if (min > array[i][j])
				{
					min = array[i][j];
				}
			}
		}
		return min;
	}

	/*
	 * Returnerar summan av alla tal i arrayen.
	 */
	public static int sum(int[][] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				sum = sum + array[i][j];
			}
		}
		return sum;
	}

	/*
	 * Metod som räknar ut medelvärdet av alla tal i arrayen.
	 */
	public static double average(int[][] array)
	{
		double sum = 0.0;
		int counter = 0;
		// Räknar ihop antal objekt i arrayen samt totala summan av alla värden.
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				sum = sum + array[i][j];
				counter++;
			}
		}
		return (double) sum / counter; // Returnerar totala summan delat på antal element i arrayen.
	}

}
