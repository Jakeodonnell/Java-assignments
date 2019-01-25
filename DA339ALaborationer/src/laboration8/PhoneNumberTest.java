package laboration8;

public class PhoneNumberTest {

	public static void test() {

		PhoneNumber ph = new PhoneNumber("0413-11111", "040-123456", "0735191919" );

		System.out.println(ph.getHome() + ", " + ph.getWork() + ", " + ph.getMobile() );
		System.out.println("-----------------------");
		System.out.println(ph.toString());
		System.out.println("-----------------------");
		ph.setHome("040-222222"); 
		ph.setWork("");
		ph.setMobile("0707657654"); 
		System.out.println( ph.toString() );
	}
	
	public static void main(String[] args) {
		PhoneNumberTest pn = new PhoneNumberTest();
		pn.test();
	}
}	
