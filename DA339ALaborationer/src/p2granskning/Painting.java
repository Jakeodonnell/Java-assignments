package p2granskning;

public class Painting {
	private String title;
	private String painter;
	private int year;
	
	public Painting(String title, String painter, int year) {
		this.title = title;
		this.painter = painter;
		this.year = year;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getPainter() {
		return this.painter;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String toString() {
		return title + " av " + painter + ", " + year;
	}
}
