package laboration3;

import javax.swing.ImageIcon;

public class Program3f {
	public void picture() {
		
		 PaintWindow window = new PaintWindow();
	        ImageIcon image1 = new ImageIcon("images/summer.jpeg");
	        ImageIcon image2 = new ImageIcon("images/winter.jpeg");
	        window.showImage(image1, 0, 0);
	        window.showImage(image2, 0, 200);
	    }
	    
	    public static void main(String[] args) {
	        Program3f p3f = new Program3f();
	        p3f.picture();
	    }
		
	}
	

