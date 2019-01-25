package laboration7;

public class House {
	
	private int year, size, garden;
	
	public House(int year, int size, int garden) {
		this.setYear (year);
		this.setSize (size);
		this.setGarden (garden);
	}
	
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setGarden(int garden) {
		this.garden = garden;
	}
	
	public int year() {
		return this.year;
	}
	
	public int size() {
		return this.year;
		
	}
	
	public int garden() {
		return this.garden;
	}
	
	public String toString() {
		return "Hus byggt " + this.year + " med " + this.size + " kvm bostadsyta. Tomten är " + this.garden + 
				" kvm stor.";
	}
	

}
