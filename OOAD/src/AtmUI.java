

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AtmUI extends JPanel{
	private Atm atm;
	private JTextArea taDisplay = new JTextArea();
	private JButton btnCard = new JButton("Insert card");
	private JButton btnPin = new JButton("Insert PIN");
	private JButton btnCash = new JButton("Request cash");
	private JButton btnCancel = new JButton("Cancel");
	private JTextField tfPin = new JTextField();
	private JTextField tfCash = new JTextField();

	public AtmUI(Atm atm) {
		setLayout(new BorderLayout(10,10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.atm = atm;
		taDisplay.setPreferredSize(new Dimension(300,100));
		taDisplay.setFont(new Font("SansSerif",Font.PLAIN,20));
		taDisplay.setBorder(BorderFactory.createLoweredBevelBorder());
		taDisplay.setLineWrap(true);
		taDisplay.setWrapStyleWord(true);

		btnCard.setPreferredSize(new Dimension(300,25));

		JPanel panelInput = new JPanel(new BorderLayout(10,10));
		JPanel panelPin = new JPanel(new GridLayout(2,1,5,5));
		Border borderIn = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border borderOut = BorderFactory.createLineBorder(Color.BLACK);
		panelPin.setBorder(BorderFactory.createCompoundBorder(borderOut, borderIn));
		panelPin.setPreferredSize(new Dimension(300,60));
		panelPin.add(tfPin);
		panelPin.add(btnPin);

		JPanel panelCash = new JPanel(new GridLayout(2,1,5,5));
		panelCash.setBorder(BorderFactory.createCompoundBorder(borderOut, borderIn));
		panelCash.setPreferredSize(new Dimension(300,60));
		panelCash.add(tfCash);
		panelCash.add(btnCash);

		JPanel centerPanel = new JPanel(new GridLayout(2,1,10,10));
		centerPanel.add(panelPin);
		centerPanel.add(panelCash);

		btnCancel.setPreferredSize(new Dimension(300,25));

		panelInput.add(btnCard, BorderLayout.NORTH);
		panelInput.add(centerPanel, BorderLayout.CENTER);
		panelInput.add(btnCancel, BorderLayout.SOUTH);

		add(taDisplay, BorderLayout.CENTER);
		add(panelInput, BorderLayout.SOUTH);

		showAtm();
		registerListeners();
	}

	private void showAtm() {
		JFrame frame = new JFrame("Bankomat");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
	}

	private void registerListeners() {
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atm.insertCard();
			}			
		});
		btnPin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atm.insertPin(tfPin.getText());
			}			
		});
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atm.requestCash(Integer.parseInt(tfCash.getText()));
			}			
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atm.cancel();
			}			
		});
	}


	public void toDisplay(String message) {
		taDisplay.setText(message);
	}
}
