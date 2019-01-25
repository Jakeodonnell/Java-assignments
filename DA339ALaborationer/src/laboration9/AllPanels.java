package laboration9;

import java.awt.Dimension;

import javax.swing.JPanel;

public class AllPanels extends JPanel {
	
	private CalcPanel calp = new CalcPanel();
	private ColorPanel colp = new ColorPanel();
	private FCConverterPanel fcc = new FCConverterPanel();
	private TransportPanel tp = new TransportPanel();
	
	public AllPanels() {
		setPreferredSize(new Dimension(700,500));
		
		add(calp);
		add(colp);
		add(fcc);
		add(tp);
		
	}

}
