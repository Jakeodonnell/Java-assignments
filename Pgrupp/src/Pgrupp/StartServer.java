package Pgrupp;

import javax.swing.SwingUtilities;
import Pgrupp.StringServer;


public class StartServer {
	static int socket = 1337 ;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				try {
					new StringServer((socket));
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
				try {
					new StringServer((socket+=1));
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
				try {
					new StringServer((socket+=1));
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
				try {
					new StringServer((socket+=1));
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
				try {
					new StringServer((socket+=1));
				} catch(Exception e) {
					System.out.println("Program: "+e);
				}
				try {
					new StringServer((socket+=1));
				} catch(Exception e) {
					System.out.println("Program: "+e); 
				}
			}
		});
	}
}
