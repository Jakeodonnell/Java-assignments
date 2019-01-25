package laboration7;

import javax.swing.JOptionPane;

public class BankAccount {
	
	private String accountNbr;
	private double balance, interestRate;
	
	public BankAccount(String accountNbr) {
		this.accountNbr = accountNbr;
		this.balance = 0;
		this.interestRate = 0.005;
	}
	public BankAccount ( String accountNbr, double balance, double interestRate) {
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccountNbr() {
		return this.accountNbr;
		
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate (double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdrawal(double withdrawal) {
		this.balance -= withdrawal;
	}
	
	public void info() {
		String message = "Account number: " + this.accountNbr + "\n" +
				"Balance: " + this.balance; 
		JOptionPane.showMessageDialog(null, message);
	}
	
}
