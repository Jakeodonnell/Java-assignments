package laboration8;

public class Contact {
	
	private String name;
	private PhoneNumber phone;
	
	public Contact(String name, String work, String mobile, String home) {
		this.name = name;
		this.phone = new PhoneNumber(home, work, mobile);
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHome(String home) {
		phone.setHome(home);
	}
	
	public void setWork(String work) {
		phone.setWork(work);
	}
	
	public void setMobile(String mobile) {
		phone.setMobile(mobile);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getHome() {
		return phone.getHome();
	}
	
	public String getMobile() {
		return phone.getMobile();
	}
	
	public String getWork() {
		return phone.getWork();
	}
	
	public String toString() {
		return "Contact: " + name + "\n" + phone.toString();
	}

}
