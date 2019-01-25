package laboration7;



public class Tabletest {
	Table t1 = new Table();
	public void test() {
		t1.setMaterial("trä");
		t1.setDepth(70);
		t1.setWidth(120);
		t1.setHeight(72);
		
		System.out.println(t1.toString());
	
	}
	
	public static void main(String[] args) {
		Tabletest tt = new Tabletest();
		tt.test();
	}

}
