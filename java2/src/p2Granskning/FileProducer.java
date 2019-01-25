package p2Granskning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * object reads file paths to the pictures from the file and makes Imageicons 
 * and stores them in a list 
 * @author kuras
 *
 */
public class FileProducer implements IconProducer {
	List<Icon> icons = new ArrayList<Icon>();
	String filename;
	int delay = 0;
	int times = 1;
	int counter = -1;

	/**
	 * Constructor takes a file path as an argument
	 * file is then used in the inner class  
	 * @param filename String path to the data txt file
	 */
	public FileProducer(String filename) {
		this.filename = filename;
		new FileCruncher().run(); // starts file read thread

	}

	/**
	 * Determines the delay value read from the file
	 */
	public int delay() {
		return this.delay;
	}

	/**
	 * Determines the number of times icons are going to be created
	 * in a {@link List}
	 */
	@Override
	public int times() {
		return this.times;
	}

	/**
	 * return the size of the {@link Buffer} holding icons
	 */
	@Override
	public int size() {
		if (icons == null)
			return 0;
		return icons.size();
	}

	/**
	 * Return next {@link Icon} from the buffer object
	 */
	@Override
	public Icon nextIcon() {
		if (icons == null || icons.size() == 0) {
			return null;
		}
		counter = (counter + 1) % icons.size();
		return icons.get(counter);
	}

	
	
	
	private class FileCruncher {
		public void run() {
			// stream for file reading wrapped in sync on icons object just for safety 
			synchronized (icons) {
				try (BufferedReader bf = new BufferedReader(
				new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
					
					times = Integer.parseInt(bf.readLine());
					delay = Integer.parseInt(bf.readLine());
					String iconPath = bf.readLine();
					while (iconPath != null) {
						icons.add(new ImageIcon(iconPath));

						iconPath = bf.readLine();
					}
				} catch (IOException e) {
					icons=null;
				}
			}
		}
	}

}
