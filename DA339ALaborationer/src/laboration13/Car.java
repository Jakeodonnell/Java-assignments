package laboration13;

public class Car extends MotorVehicle{
	
	private String regNbr;
	
	public Car() {
		super();
		this.regNbr = "";
	}
	
	public Car(String owner, int hp, String regNbr) {
		super(owner, hp);
		this.regNbr = regNbr;	
	}
	
	public void setRegNbr(String regNbr) {
		this.regNbr = regNbr;
	}
	
	public String getRegNbr() {
		return regNbr;
	}
	
	public String toString() {
		return super.toString() + " Registreringsnummer: " + regNbr;
	}
	
	public static void main(String[] args) {
		 Car car1 = new Car("Doris Bengtsson",80,"FGT 450");
		 Motorcycle mc1 = new Motorcycle("Klas Bengtsson",70,"KKI 333");
		 Car car2 = new Car();
		 car2.setOwner("Fredrik Hansson");
		 car2.setHp(100);
		 car2.setRegNbr("HHH 778");
		 System.out.println(car1);
		 System.out.println(mc1);
		 System.out.println(car2);
		}
}
