package laboration13;

public class Motorcycle extends MotorVehicle{
	
	private String regNbr;
	
	public Motorcycle() {
		super();
		this.regNbr = "";
	}
	
	public Motorcycle(String owner, int hp, String regNbr) {
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
	
	
}
