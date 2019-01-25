package p1Granskning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FileProducer implements IconProducer {
	private Icon[] icons;
	private String fileName;
	private int delay = 0;
	private int times = 0;
	private int size = 0;
	private int currentIndex = -1;

	/**
	 * Using the filename the constructor does as follows[In a try/catch in case of an IOException]:
	 * 1) Creates a bufferedReader(br) to read from the file.
	 * 
	 * 2) Uses (br) to read each line of the file and store them in an ArrayList<String>. 
	 * 	  According to the format:
	 *   [Amount of times to display(index = 0), Amount of times to delay between displays(index = 1), Filename/s(index > 1)].
	 *  
	 * 3) The ArrayList size is then used to create the Icons array with the size of the ArrayList.
	 * 
	 * 4) A new Icon object is created for/with every filename and is stored in the Icon array.
	 * @param fileName
	 */
	
	public FileProducer(String fileName) {

		this.fileName = fileName;

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(this.fileName), "UTF-8"))) {
			
			
			ArrayList<String> iconNameStrings = new ArrayList<String>();
			
			
			
			int index = 0;
			String readStr = br.readLine();
			
			while (readStr != null) {
				
				if (index == 0) {
					
					this.times = Integer.parseInt(readStr);
				} else if (index == 1) {

					this.delay = Integer.parseInt(readStr);
				} else {
					
					iconNameStrings.add(readStr);
				}
				index++;
				readStr = br.readLine();
			}
			
			
			this.icons = new Icon[iconNameStrings.size()];
			
			for(int i = 0; i < icons.length; i++) {
				
				this.icons[i] = new ImageIcon(iconNameStrings.get(i));
			}
			
			this.size = icons.length;
			
			
			

		} catch (IOException e) {
			System.err.println(e);
		}

	}
	
	/**
	 * The delay between each display of the Icons.
	 */

	public int delay() {
		return this.delay;
	}

	/**
	 * The amount of times all of the icons should be shown.
	 */
	
	@Override
	public int times() {
		return this.times;
	}

	/**
	 * The size of the Icons array.
	 */
	
	@Override
	public int size() {
		return this.size;
	}
	
	/**
	 * This creates a variable currentIndex+1 or 0 if its at the last index of the icon array. This is the next index used to 
	 * return the next icon.
	 * If icon.size() = 7;
	 * 
	 * currentIndex = 4 |
	 * 4 = 5 % 7 | Result | currentIndex(new) = 5 |
	 * 7 = 7 % 7 | Result | currentIndex(new) = 0 |
	 *  
	 */

	@Override
	public Icon nextIcon() {

		
		if(icons == null || icons.length == 0) {
			
			return null;
		} else {
			
			currentIndex = (currentIndex+1) % icons.length;
		}

		return icons[currentIndex];
	}

}
