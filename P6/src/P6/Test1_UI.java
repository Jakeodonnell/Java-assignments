package P6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates a graphic environment that contains a numerous of different J-components.
 * The class contains 49 JLabel-components that shows the values who is stored in a Array7x7-object.
 * 
 * @author Anna Brondin, Jake O'Donnell, Markus Nordstrˆm, Benjamin Jonsson Zakrisson, Sebastian Carlsson, Stefan von Freytag-Loringhoven.
 *
 */

public class Test1_UI extends JPanel {
	private Controller controller;

	// Grid things
	private JLabel[][] lblGrid = new JLabel[7][7];
	private JTextField[] tfRow = new JTextField[7];
	private JTextField[] tfCol = new JTextField[7];
	private JPanel gridPanel = new JPanel();
	private JTextField tfEmpty = new JTextField("");
	private Font gridFont = new Font("MONOSPACED", Font.BOLD, 30);

	// Control things
	private Font controlFont = new Font("Arial", Font.PLAIN, 14);
	private JPanel controlPanel = new JPanel();
	private JPanel rowPanel = new JPanel();
	private JPanel colPanel = new JPanel();
	private JPanel rowInnerPanel = new JPanel();
	private JPanel colInnerPanel = new JPanel();
	private JLabel lblColControl = new JLabel("Rad nr:");
	private JLabel lblRowControl = new JLabel("Kolumn nr:");
	private JSpinner spinRowControl = new JSpinner(new SpinnerNumberModel(4, 1, 7, 1));
	private JSpinner spinColControl = new JSpinner(new SpinnerNumberModel(4, 1, 7, 1));
	private JButton btnRowRead = new JButton("Läs kolumn");
	private JButton btnColRead = new JButton("Läs rad");
	private JButton btnRowWrite = new JButton("Skriv kolumn");
	private JButton btnColWrite = new JButton("Skriv rad");
	// Listener
	private ButtonListener listen = new ButtonListener();
	
	/**
	 * Constructor
	 * @param controller
	 */
	
	public Test1_UI(Controller controller) {
		this.controller = controller;
		controller.setUI(this);

		setLayout(new BorderLayout(20, 0));
		init_grid();
		add(gridPanel, BorderLayout.CENTER);
		init_controlPanels();
		add(controlPanel, BorderLayout.EAST);
		setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 30));
	}
	
	/**
	 * Initialize the Grid
	 * 
	 */
	
	private void init_grid() {
		gridPanel.setLayout(new GridLayout(8, 8, 2, 2));
		gridPanel.setPreferredSize(new Dimension(400, 400));
		for (int row = 0; row < lblGrid.length; row++) {
			tfRow[row] = new JTextField("0", 1);
			tfRow[row].setFont(gridFont);
			tfRow[row].setHorizontalAlignment(JTextField.CENTER);
			gridPanel.add(tfRow[row]);
			for (int col = 0; col < lblGrid[row].length; col++) {
				lblGrid[row][col] = new JLabel();
				lblGrid[row][col].setSize(new Dimension(30, 30));
				lblGrid[row][col].setBackground(new Color(200, 200, 200));
				lblGrid[row][col].setOpaque(true);
				lblGrid[row][col].setHorizontalAlignment(JLabel.CENTER);
				lblGrid[row][col].setText("0");
				lblGrid[row][col].setFont(gridFont);
				lblGrid[row][col].setBorder(BorderFactory.createEmptyBorder());
				gridPanel.add(lblGrid[row][col]);
			}
		}
		tfEmpty.setEnabled(false);
		gridPanel.add(tfEmpty);
		for (int i = 0; i < 7; i++) {
			tfCol[i] = new JTextField("0", 1);
			tfCol[i].setFont(gridFont);
			tfCol[i].setHorizontalAlignment(JTextField.CENTER);
			gridPanel.add(tfCol[i]);
		}
		gridPanel.setBorder(BorderFactory.createEtchedBorder());
	}
	
	/**
	 * Initilize the control panel.
	 */
	
	private void init_controlPanels() {
		// Row
		lblRowControl.setFont(controlFont);
		rowInnerPanel.add(lblRowControl);
		spinRowControl.setPreferredSize(new Dimension(30, 35));
		rowInnerPanel.add(spinRowControl);
		rowPanel.setLayout(new GridLayout(3, 1, 20, 20));
		rowPanel.setPreferredSize(new Dimension(150, 200));
		rowPanel.add(rowInnerPanel);
		btnRowRead.addActionListener(listen);
		btnRowWrite.addActionListener(listen);
		rowPanel.add(btnRowRead);
		rowPanel.add(btnRowWrite);

		// Col
		lblColControl.setFont(controlFont);
		colInnerPanel.add(lblColControl);
		spinColControl.setPreferredSize(new Dimension(30, 35));
		colInnerPanel.add(spinColControl);
		colPanel.setLayout(new GridLayout(3, 1, 20, 20));
		colPanel.setPreferredSize(new Dimension(150, 200));
		colPanel.add(colInnerPanel);
		btnColRead.addActionListener(listen);
		btnColWrite.addActionListener(listen);
		colPanel.add(btnColRead);
		colPanel.add(btnColWrite);

		// Control
		controlPanel.setLayout(new GridLayout(2, 1, 30, 20));
		controlPanel.add(rowPanel);
		controlPanel.add(colPanel);
	}
	
	/**
	 * Updates the Array7x7.
	 */
	
	public void update() {
		Array7x7 array = controller.getArray7x7();
		int[][] update = array.toIntArray();
		for(int row = 0; row < lblGrid.length; row++) {
			for(int col = 0; col < lblGrid[row].length; col++) {
				lblGrid[col][row].setText("" + update[row][col]);
			}
		}
	}
	
	/**
	 * This method returns an array7 based on the values by the setBottomRow
	 * @return ret
	 */
	
	public int[] getBottomRow() {
		int[] ret = new int[7];
		for (int i = 0; i < ret.length; i++) {
			try {
				ret[i] = Integer.parseInt(tfRow[i].getText());	
			}catch(Exception e){
				System.out.println(e.toString());
				ret[i] = 0;
			}
		}
		return ret;
	}
	
	/**
	 * This method returns an array7 based on the values by the setLeftCol.
	 * @return ret
	 */
	
	public int[] getLeftCol() {
		int[] ret = new int[7];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Integer.parseInt(tfCol[i].getText());
		}
		return ret;
	}
	
	/**
	 * This method sets the buttom row.
	 * @param values
	 */
	
	public void setBottomRow(int[] values) {
		for (int i = 0; i < values.length; i++) {
			tfRow[i].setText(Integer.toString(values[i]));
		}
	}
	
	/**
	 * This method sets the left column.
	 * @param values
	 */
	
	public void setLeftCol(int[] values) {
		for (int i = 0; i < values.length; i++) {
			tfCol[i].setText(Integer.toString(values[i]));
		}
	}
	
	/**
	 * This class is responsible calling methods based on the users 
	 * pressing of buttons.
	 */
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnRowRead) {
				controller.getRow((Integer) spinRowControl.getValue() - 1);
				update();
			} else if (e.getSource() == btnColRead) {
				controller.getCol((Integer) spinColControl.getValue() - 1);
				update();
			} else if (e.getSource() == btnRowWrite) {
				controller.setRow((Integer) spinRowControl.getValue() - 1);
				update();
			} else if (e.getSource() == btnColWrite) {
				controller.setCol((Integer) spinColControl.getValue() - 1);
				update();
			}

		}

	}
	
	/**
	 * Main method.
	 * @param args
	 */
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("");
				frame.getContentPane().setBackground(Color.WHITE);
				// frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new Test1_UI(controller));
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
