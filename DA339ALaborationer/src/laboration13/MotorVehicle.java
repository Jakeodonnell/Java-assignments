package laboration13;

public class MotorVehicle extends Vehicle{
	
	private int hp;
	
	public MotorVehicle() {
		super ();
		this.hp = 0;
	}
	
	public MotorVehicle(String owner, int hp) {
		super (owner);
		this.hp = hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public String toString() {
		return super.toString() + " Motorns hästkrafter: " + hp;
	}
	
	public static void main(String[] args){
		 MotorVehicle m1= new MotorVehicle();
		 MotorVehicle m2= new MotorVehicle("Lina Nilsson",100);
		 System.out.println(m1.toString());
		 System.out.println(m2.toString());
		 m1.setOwner("Ola Torstensson");
		 m1.setHp(200);
		 System.out.println(m1.toString());
	}
}
