package laboration13;

public class Bicycle extends Vehicle{

	private String färg;

	public Bicycle() {
		super();
		this.färg = "okänd färg";
	}

	public Bicycle(String owner, String färg) {
		super(owner);
		this.färg = färg;
	}
	
	public String getFärg() {
		return färg;
	}
	
	public void setFärg(String färg) {
		this.färg = färg;
	}
	
	public String toString() {
		return " Ägare av cyckel: " + super.getOwner() + " ||" + " Färg: " + färg;
	}
	
	public static void main(String[] args){
		 Bicycle b1 = new Bicycle();
		 Bicycle b2 = new Bicycle("Lina Nilsson","blå");
		 System.out.println(b1.toString());
		 System.out.println(b2.toString());
		 b1.setOwner("Ola Torstensson");
		 b1.setFärg("gul");
		 System.out.println(b1.toString());
		}
}
