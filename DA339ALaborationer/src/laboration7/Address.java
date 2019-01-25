package laboration7;



public class Address {

	private String street, town;
	private int postalCode;

	public Address (String street, int postalCode, String town) {

		this.setStreet (street);
		this.setPostalCode(postalCode);
		this.setTown(town);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String toString () {
		return this.street + "\n" + this.postalCode + " " + this.town;
	}

}
