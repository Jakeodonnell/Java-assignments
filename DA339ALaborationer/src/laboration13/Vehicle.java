package laboration13;

public class Vehicle {
	
	private String owner;
	
	public Vehicle(String owner) {
		this.owner = owner;
	}
	
	public Vehicle() {
		this.owner = ("Okänd ägare");
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String toString() {
		return "Ägare: " + owner;
	}
	
	public static void main(String[] args){
		 Vehicle v1= new Vehicle();
		 Vehicle v2= new Vehicle("Lina Nilsson");
		 System.out.println(v1.toString());
		 System.out.println(v2.toString());
		 v1.setOwner("Ola Torstensson");
		 System.out.println(v1.getOwner());
		}

}
