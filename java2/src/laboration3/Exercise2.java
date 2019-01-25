package laboration3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

	public void statistics(String filename) throws IOException {

		try (BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(filename),"ISO-8859-1"))) {
			int count=0;
			int women=0;
			String name = br.readLine(); 

			while(name!=null) {
				count++; System.out.print(name); 
				if(name.endsWith("K")) {
					women++;
				}
				name = br.readLine(); 
				if(name!=null) {
					System.out.print(", ");
				}
			}
			System.out.print("\nAntal medlemmar: "+count+" , därav "+
					women+" kvinnor.\n");
		} 
	}
	public static void main(String[] args) throws IOException{ 
		Exercise2 ex2 = new Exercise2(); 
		ex2.statistics("files/medlemmar.txt");
	} 
}
