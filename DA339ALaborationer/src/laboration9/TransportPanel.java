package laboration9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class TransportPanel extends JPanel{

	JLabel jlfråga = new JLabel("Hur tar du dig till MAH?");
	JLabel jlsvar = new JLabel();
	JCheckBox jcbbil = new JCheckBox("Bil");
	JCheckBox jcbtåg = new JCheckBox("Tåg");
	JCheckBox jcbbuss = new JCheckBox("Buss");
	JCheckBox jcbcyckel = new JCheckBox("Cyckel");
	JCheckBox jcbgår = new JCheckBox("Går");

	

	public TransportPanel () {

		setPreferredSize(new Dimension(450, 60));
		setBackground(Color.CYAN);
		
		jlfråga.setPreferredSize(new Dimension (380, 15));



		jcbbil.setPreferredSize(new Dimension(70, 20));
		jcbtåg.setPreferredSize(new Dimension(70, 20));
		jcbbuss.setPreferredSize(new Dimension(70, 20));
		jcbcyckel.setPreferredSize(new Dimension(80, 20));
		jcbgår.setPreferredSize(new Dimension(70, 20));

		jlsvar.setPreferredSize(new Dimension(380,20));

		addListeners();

		add(jlfråga);
		add(jcbbil);
		add(jcbtåg);
		add(jcbbuss);
		add(jcbcyckel);
		add(jcbgår);
		add(jlsvar);

	}

	private void addListeners() {
		TransportListener listener = new TransportListener();
		jcbbil.addItemListener(listener);
		jcbtåg.addItemListener(listener);
		jcbbuss.addItemListener(listener);
		jcbcyckel.addItemListener(listener);
		jcbgår.addItemListener(listener);

	}


	private class TransportListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {

			String res = "Du använder: ";
			

			if(jcbbil.isSelected() == true) {
				res += "bil ";
			}
			
			if(jcbtåg.isSelected() == true) {
				res += "tåg ";
			}
			
			if(jcbbuss.isSelected() == true) {
				res += "buss ";
			}
			
			if(jcbcyckel.isSelected() == true) {
				res += "cyckel ";
				
			}
			
			if(jcbgår.isSelected() == true) {
				res += "går ";
			}
			
			jlsvar.setText(res);
		}
	}

	public static void main(String [] args) {
		TransportPanel panel = new TransportPanel(); 
		panel.setBorder(BorderFactory.createLineBorder(Color.black)); 
		JOptionPane.showMessageDialog(null, panel);
	}
}
