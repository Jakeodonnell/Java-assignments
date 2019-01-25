package laboration12;

public class Exercise12b {

	public void printCountries( Population[] array ) {
		for(Population pop: array) {
			System.out.println(pop.getCountry());
		}
	}
	public void moreThanHundredMillions( Population[] array ) {
		for(Population pop: array) {
			if(pop.getPopulation()> 100000000) {
				System.out.println(pop);
			}
		}
	}
	public void startsWithM( Population[] array ) {
		for(Population pop: array) {
			String country = pop.getCountry();
			char firstchar = country.charAt(0); 
			if (firstchar == 'A') {
				System.out.println(pop);
			}
		}
	}
	public void eightToTenMillions( Population[] array ) {
		for(Population pop: array) {
			if(8000000 < pop.getPopulation() && pop.getPopulation() < 10000000) {
				System.out.println(pop);
			}
		}
	}
	public void program() {
		Population[]countries = Populations.readPopulations(
				"files/befolkning.txt" ); 
	
		//		printCountries( countries ); 
		//		moreThanHundredMillions(countries); 
		//		startsWithM(countries); 
				eightToTenMillions(countries);
	}
	public static void main( String[] args ) { 
		Exercise12b e12b = new Exercise12b(); 
		e12b.program();
	}
}


