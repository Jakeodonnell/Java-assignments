package laboration3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise1 {

	public void sum(String heltal) throws IOException {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(heltal))) {
			
			int sum = 0;
			int j = dis.readInt(); 
			
			for(int i = 0; i < j; i++) {
				sum += dis.readInt();
			}
			System.out.println(sum); 
		}
	}
	public static void main(String[] args) throws IOException { 
		Exercise1 ex1 = new Exercise1(); 
		ex1.sum("files/heltal.dat");
	}
}