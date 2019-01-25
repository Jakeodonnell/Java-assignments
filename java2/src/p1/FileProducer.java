package p1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 
 * @author JakeODonnell
 *
 */

public class FileProducer implements IconProducer {

	private ArrayList<Icon> iconList = new ArrayList<Icon>(); 
	private int delay;
	private int repeatSeq;
	private int currentIndex = 0;

/**
 * This constructor takes in a string parameter and sets different variables to be what is rreeaed in the file.
 * repeatSeq becomes the integer of the line read for example.
 * Also as long as the String contains any elements (!= null) it will add an icon to the end of the icon list
 * @param filename
 */
	public FileProducer(String filename) {
		try 
		(BufferedReader bw = new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8"))) {
			Icon icon;
			this.repeatSeq = Integer.parseInt(bw.readLine());
			this.delay = Integer.parseInt(bw.readLine());
			String line = bw.readLine();
			while(line!=null) {
				icon = new ImageIcon(line);
				iconList.add(icon);
				line = bw.readLine();
			}
		}catch(IOException e) {}	
	}
	
	@Override
	public int delay() {
		return delay;
	}

	@Override
	public int times() {
		return repeatSeq;
	}

	@Override
	public int size() {
		return iconList.size();
	}

	@Override 
	public Icon nextIcon() {
		if(currentIndex >= iconList.size()) {
			currentIndex = 0;
		}
		return iconList.get(currentIndex++);
	}
}