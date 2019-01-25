/*
 * Klassen innehåller metoder för att sortera och hantera en array med Countryobjekt.
 * @author Mikael Lindfors den 16/11-2017
 * 
 **/



package arraysgranskning;

public class CountryArrays
{
	/* Metod som går genom en array med Countryobjekt och 
	 * lagrar allt i en Sträng som returneras. 
	 */
	public static String toString(Country[] array)
	{
		String sum = "{";
		for (int i=0;i<array.length;i++)
		{
			if (i!=array.length-1) //Inte sista objektet i arrayen
				sum = sum + "["+ array[i].getName()+ "," + array[i].getPopulation() + "]" +",";
			else //Sista objektet i arrayen. Lägger till "}" på slutet.
				sum = sum + "["+ array[i].getName()+ "," + array[i].getPopulation() + "]" + "}";
		}	
		return sum; 
	}
	/* Metod som retunerar platsen på ett visst Countryobjekt i arrayen. Om inget objekt
	 * har hittats så kommer -1 returneras.
	 */
	public static int indexOf(Country[] array, Country country)
	{ 
		for (int i=0;i<array.length;i++)
		{
			if (array[i].equals(country))
			{
				return i;
			}
		}
		return -1;
	} 
	/* Metod som tar emot ett Countryobjekt och en array med Countryobjekt 
	 * Om Countryobjektet hittas i arrayen så kommer boolean true returneras.
	 */
	public static boolean member(Country[] array, Country country)
	{
		for (int i=0;i<array.length;i++)
		{
			if(array[i].equals(country))
			{
				return true;
			}
		}
		return false;
	}
	
	/* Metod som tar emot en array med Countryobjekt och letar upp det minsta
	 * objektet i arrayen och returnerar det.
	 */
	public static Country min(Country[] array)
	{
		Country min = array[0];
		for (int i=0;i<array.length;i++)
		{
			if (min.compareTo(array[i])>0)
			{
				min = array[i];
			}
		}
		return min;
	}
	/* Metod som tar emot en array med Countryobjekt och letar upp det största
	 * objektet i arrayen och returnerar det.
	 */
	
	public static Country max(Country[] array)
	{
		Country max = array[0];
		for (int i=0;i<array.length;i++)
		{
			if (max.compareTo(array[i])<0)
			{
				max = array[i];
			}
		}
		return max;
	}	
}
