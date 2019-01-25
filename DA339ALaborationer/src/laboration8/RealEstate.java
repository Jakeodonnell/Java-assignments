package laboration8;

public class RealEstate {
	
	private String name;
	private Building building;
	private Address address;
	
	public RealEstate(String name, Building building, Address address) {
		this.name = name;
		this.building = building;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public String toString() {
		return "Fastighet: " + name + "\nByggnad: " + building + "\nAddress: " + address;
	}

}
