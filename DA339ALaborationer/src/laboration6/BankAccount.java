package laboration6;

import javax.swing.JOptionPane;

public class BankAccount {
	
	private String accountNbr;
	private double balance, intrestRate;

	public void init(String accountNbr, double balance, double intrestRate) {

		this.accountNbr = accountNbr;
		this.balance = balance;
		this.intrestRate = intrestRate;

	}

	public void deposit(double amount) {
		this.balance = balance + amount;

	}

	public void withdrawal(double amount) {
		this.balance = balance - amount;

	}
	
	public void info() {
		JOptionPane.showMessageDialog(null, "Account number: " + accountNbr + "\nBalance " + balance + "kr" );
	}
}
