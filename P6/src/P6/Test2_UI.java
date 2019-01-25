package P6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import ExternalResources.Color;

/**
 * This class creates a graphic environment that contains a numerous of different J-components.
 * The class contains 49 JLabel-components that shows the values who is stored in a Array7x7-object.
 * In this class you have the options to move the array7x7 to the left and right where the values is in the JTextField-components and later stored in the Array7x7.
 * 
 * @author Anna Brondin, Jake O'Donnell, Markus Nordstrˆm, Benjamin Jonsson Zakrisson, Sebastian Carlsson, Stefan von Freytag-Loringhoven.
 *
 */

public class Test2_UI extends JPanel {
	private Controller controller;
	private Color clr = new Color();
	private Random rng = new Random();
	charArchive archive = new charArchive();
	private final int GRID = 0, LEFT = 1, RIGHT = 2, BOTTOM = 3;
	// FONTS
	private Font gridFont = new Font("MONOSPACED", Font.BOLD, 30);
	private Font controlFont = new Font("Arial", Font.PLAIN, 14);

	// GRID THINGS
	private JLabel[][] lblGrid = new JLabel[7][7];
	private JTextField[] tfLeft = new JTextField[7];
	private JTextField[] tfRight = new JTextField[7];
	private JPanel[] panels = new JPanel[4]; // JPANEL: GRID = 0, LEFT = 1, RIGHT = 2, BOTTOM = 3;

	// CONTROLL THINGS
	private JButton[] buttons = new JButton[2];
	private ActionListener listener = new btnPress();

	// PREMADE COLORS
    public static final int BLACK       = 0xFF000000;
    public static final int DKGRAY      = 0xFF444444;
    public static final int GRAY        = 0xFF888888;
    public static final int LTGRAY      = 0xFFCCCCCC;
    public static final int WHITE       = 0xFFFFFFFF;
    public static final int RED         = 0xFFFF0000;
    public static final int GREEN       = 0xFF00FF00;
    public static final int BLUE        = 0xFF0000FF;
    public static final int YELLOW      = 0xFFFFFF00;
    public static final int CYAN        = 0xFF00FFFF;
    public static final int MAGENTA     = 0xFFFF00FF;
    public static final int TRANSPARENT = 0;
	
    /**
	 * Constructor
	 * @param controller
	 */
	
	public Test2_UI(Controller controller) {
		this.controller = controller;
		controller.setUI(this);

		setLayout(new BorderLayout(10,10));
		panels[GRID] = init_grid(lblGrid);
		panels[LEFT] = init_control(tfLeft);
		panels[RIGHT] = init_control(tfRight);
		panels[BOTTOM] = init_buttons(buttons);
		controller.random_7x7();
		update();
		add(panels[GRID], BorderLayout.CENTER);
		add(panels[LEFT], BorderLayout.WEST);
		add(panels[RIGHT], BorderLayout.EAST);
		add(panels[BOTTOM], BorderLayout.SOUTH);
	}

	/**
	 * Initialize the Grid
	 * 
	 * @return JPanel
	 */
	public JPanel init_grid(JLabel[][] grid) {
		JPanel returnPanel = new JPanel();
		returnPanel.setLayout(new GridLayout(7, 7, 2, 2));
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				grid[y][x] = new JLabel();
				grid[y][x].setSize(new Dimension(30, 30));
				grid[y][x].setBackground(toColor(LTGRAY));
				grid[y][x].setOpaque(true);
				grid[y][x].setHorizontalAlignment(JLabel.CENTER);
				grid[y][x].setText("0");
				grid[y][x].setFont(gridFont);
				grid[y][x].setBorder(BorderFactory.createEmptyBorder());
				returnPanel.add(grid[y][x]);
			}
		}
		return returnPanel;
	}

	/**
	 * Initilaze JTextField-components.
	 * 
	 * @param tf
	 * @return JPanel
	 */
	
	public JPanel init_control(JTextField[] tf) {
		JPanel returnPanel = new JPanel();
		returnPanel.setLayout(new GridLayout(7, 1, 2, 2));
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new JTextField();
			tf[i].setSize(new Dimension(30, 30));
			tf[i].setBackground(toColor(LTGRAY));
			tf[i].setOpaque(true);
			tf[i].setText("0");
			tf[i].setFont(controlFont);
			tf[i].setHorizontalAlignment(JLabel.CENTER);
			tf[i].setBorder(BorderFactory.createEtchedBorder());
			returnPanel.add(tf[i]);
		}
		returnPanel.setPreferredSize(new Dimension(50,500));
		return returnPanel;
	}
	
	/**
	 * Initilaze JButtons-components.
	 * 
	 * @param btn
	 * @return JPanel
	 */
	
	public JPanel init_buttons(JButton[] btn) {
		JPanel returnPanel = new JPanel();
		returnPanel.setLayout(new GridLayout(1,2,10,10));
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setPreferredSize(new Dimension(150,50));
			btn[i].setFont(controlFont);
			if(i == 0) 
				btn[i].setText("<- Flytta Vänster");
			else
				btn[i].setText("Flytta Höger ->");
			btn[i].setHorizontalAlignment(JLabel.CENTER);
			btn[i].setOpaque(true);
			btn[i].setBackground(toColor(LTGRAY));
			btn[i].setBorder(BorderFactory.createEtchedBorder());
			btn[i].addActionListener(listener);
			returnPanel.add(btn[i]);
		}
		return returnPanel;
	}
	
	/**
	 * This method updates the Array7x7
	 */
	
	public void update() {
		Array7x7 array = controller.getArray7x7();
		int[][] update = array.toIntArray();
		for(int row = 0; row < lblGrid.length; row++) {
			for(int col = 0; col < lblGrid[row].length; col++) {
				lblGrid[row][col].setText("" + update[row][col]);
			}
		}
	}
	
	/**
	 *  This method returns an array7 based on the values by the JTextField array.
	 * @param jTf
	 * @return Array7
	 */
	
	public Array7 getValues(JTextField[] jTf) {
		Array7 res = new Array7();
		for(int i = 0; i < jTf.length; i++) {
			try {
				res.setElement(i, Integer.parseInt(jTf[i].getText()));
			} catch(Exception e) {
				res.setElement(i, 0);
			}
		}
		return res;
	}
	
	/**
	 * This method moves the array one step to the right.
	 * @param right
	 */
	
	public void setRight(Array7 right) {
		for(int i = 0; i < tfRight.length; i++) {
			tfRight[i].setText(right.getElement(i) + "");
		}
	}
	
	/**
	 * This method moves the array one step to the left
	 * @param left
	 */
	
	public void setLeft(Array7 left) {
		for(int i = 0; i < tfLeft.length; i++) {
			tfLeft[i].setText(left.getElement(i) + "");
		}
	}
	
	/**
	 * This class is responsible calling methods based on 
	 * the users pressing of buttons.
	 */
	class btnPress implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == buttons[0]) {
				controller.shiftLeft(getValues(tfRight));
				update();
				System.out.println("Left");
			} else if(e.getSource() == buttons[1]) {
				controller.shiftRight(getValues(tfLeft));
				update();
				System.out.println("Right");
			}
			
		}
		
	}
	public static java.awt.Color toColor(int color) {
		return new java.awt.Color(Color.red(color),Color.green(color),Color.blue(color),Color.alpha(color));
	}
	
	/**
	 * Main method
	 * @param args
	 */
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("");
				frame.setPreferredSize(new Dimension(500, 500));
				frame.getContentPane().setBackground(toColor(WHITE));
				// frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new Test2_UI(controller));
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
