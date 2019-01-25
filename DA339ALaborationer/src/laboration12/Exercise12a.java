package laboration12;

public class Exercise12a {

	public void program() {

		Population[] countries = Populations.readPopulations( "files/befolkning.txt" );

		//		for(int i = 0; i < countries.length; i++ ) { 
		//			System.out.println(countries[ i ].getCountry() + ", " + countries[ i ].getPopulation() );
		//		}

		//		for(int i = 0; i < countries.length; i++) {
		//			System.out.println(countries[ i ].getCountry());	
		//		}
		//		for ( int i = 0; i < countries.length; i ++) {
		//			long inhabitants = countries[ i ].getPopulation();
		//			
		//			if (inhabitants < 1000000) {
		//				System.out.println(countries[i].toString());
		//			}
		//		}

		//		for(int i = 0; i < countries.length; i++) {
		//			
		//			String country = countries[ i ].getCountry();
		//			char firstChar = country.charAt( 0 );
		//			
		//			if (firstChar == 'M') {
		//				System.out.println(countries[i].getCountry());
		//			}	
		//		}

		//		for(int i = 0; i < countries.length; i++) {
		//			
		//			if ((countries[i].getPopulation()<10000000) && (countries[i].getPopulation()>8000000)) {
		//				System.out.println(countries[i].toString());
		//			}
		//		}
		//		int sum = 0;
		//		for(int i = 0; i < countries.length; i++) {
		//			if (countries[i].getPopulation() < 1000000) {
		//				sum += 1;
		//			}
		//		}
		//		System.out.println(sum + " länder hat mindre än 1miljon invånare");

		//		int sum = 0;
		//		for(int i = 0; i < countries.length; i++) {
		//			String country = countries[i].getCountry();
		//			char firstChar = country.charAt( 0 ) ;
		//			
		//			if(firstChar == 'K') {
		//				sum ++;
		//			}
		//		}
		//		
		//		System.out.println(sum + " länder börjar på K");

		//		long inhabitants;
		//		int index = 0;
		//		int counter = 0;
		//
		//		for( int i = 0; i< countries.length; i ++) {
		//			inhabitants = countries[ i ].getPopulation();
		//			if (inhabitants < 12000000 && inhabitants > 10000000) {
		//				counter ++;
		//			}
		//		}
		//
		//		Population[] newArray = new Population[ counter ];
		//		for( int i = 0; i < countries.length; i++ ) {
		//			inhabitants = countries[ i ].getPopulation();
		//			if( ( inhabitants >= 10000000 ) && ( inhabitants <= 12000000 ) ) {
		//				newArray[ index ] = countries[ i ];
		//				index++; 
		//			}
		//		}
		//
		//		for (int i = 0; i< newArray.length; i++) {
		//			System.out.println(newArray[i].toString());
		//		}
		//		int index = 0;
		//		int counter = 0;
		//
		//		for(int i = 0; i < countries.length; i++) {
		//			String country = countries[i].getCountry();
		//			char firstchar = country.charAt(0);
		//
		//			if( firstchar == 'K') {
		//				counter ++;
		//			}
		//		}
		//
		//		Population[] newArray = new Population[ counter ];
		//		for(int i = 0; i < countries.length; i++) {
		//			String country = countries[i].getCountry();
		//			char firstchar = country.charAt(0);
		//
		//			if( firstchar == 'K') {
		//				newArray[ index ] = countries[ i ];
		//				index ++;
		//			}
		//		}
		//
		//		for(int i = 0; i<newArray.length; i++) {
		//			System.out.println(newArray[i].toString());
		//		}


		//		for(Population pop: countries) {
		//			
		//			System.out.println(pop.getCountry());
		//		}
		//				
		//				int counter= 0;
		//				for(Population pop: countries) {
		//					
		//					if((pop.getPopulation() < 1000000)) {
		//						counter +=1;
		//					}
		//				}
		//				System.out.println(counter + " länder har mindre än 1 miljon invånare");
		//		

				}



		public static void main( String[] args ) { 
			Exercise12a e12a = new Exercise12a();
			e12a.program();

		}
	}

