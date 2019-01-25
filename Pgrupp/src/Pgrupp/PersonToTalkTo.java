//package Pgrupp;
//
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JPanel;
//
//public class PersonToTalkTo extends JPanel implements ActionListener{
//
//	private StartClient sc;
//	private JButton p1 = new JButton("Jake");
//	private JButton p2 = new JButton("Marcus");
//	private JButton p3 = new JButton("Anna");
//	private JButton p4 = new JButton("Stefan");
//	private JButton p5 = new JButton("Sebastian");
//	private JButton p6 = new JButton("Benjamin");
//
//
//	public PersonToTalkTo() {
//
//		setLayout(new GridLayout(1,1));
//		add(p1);
//		add(p2);
//		add(p3);
//		add(p4);
//		add(p5);
//		add(p6);
//		
//		p1.addActionListener(this);
//		p2.addActionListener(this);
//		p3.addActionListener(this);
//		p4.addActionListener(this);
//		p5.addActionListener(this);
//		p6.addActionListener(this);
//		
//	}
//
//
//	public void actionPerformed(ActionEvent e)  {
//		if(e.getSource() == p1) {
//			sc.setSocket(1337);
//			
//		}
//		if(e.getSource() == p2) {
//			sc.setSocket(1338);
//		}
//		if(e.getSource() == p3) {
//			sc.setSocket(1339);
//		}
//		if(e.getSource() == p4) {
//			sc.setSocket(1340);
//		}
//		if(e.getSource() == p5) {
//			sc.setSocket(1341);
//		}
//		if(e.getSource() == p6) {
//			sc.setSocket(1341);
//		}
//	}
//}
