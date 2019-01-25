package laboration7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Uppgift3 {

	public static void main(String[] args) throws MalformedURLException { 
		try { 
			URL u = new URL("http://ddwap.mah.se/ah7328/Untitled.html"); 
			try (InputStreamReader isr = new InputStreamReader(u.openStream());
					BufferedReader br = new BufferedReader(isr)) { 
				System.out.println("Text från " + u.toString()); 
				int c;
				while((c=br.read())!=-1) {  
					System.out.print((char)c); 
				}
			}
		} catch (IOException ex) { 
			System.err.println(ex);
		} 
	}
}