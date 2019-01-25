package laboration3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

public class Program3m {
	public void res() {

		int width, height;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension d = toolkit.getScreenSize();

		width = d.width;
		height = d.height;

		JOptionPane.showMessageDialog(null, "resolution running on your screen: " + width + "x" + height);

	}

	public static void main(String[] args) {
		Program3m p3m = new Program3m();
		p3m.res();
	}

}
