package laboration8;

public class PhoneNumber {
	
	private String home;
	String work;
	private String mobile;

	public PhoneNumber(String home, String work, String mobile) {
		this.home = home;
		this.work = work;
		this.mobile = mobile;
	}
	
	public void setHome (String home) {
		this.home = home;
	}
	public void setWork (String work) {
		this.work = work;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getHome() {
		return this.home;
	}
	
	public String getWork() {
		return this.work;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	
	public String toString() {
		return "Home: " + home + "\nWork: " + work + "\nMobile: " + mobile;
	}
}
