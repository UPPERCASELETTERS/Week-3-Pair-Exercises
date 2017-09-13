package com.techelevator;

public class BankAccount {
	
	private String accountNumber;
	private DollarAmount balance= new DollarAmount(0);
	
	public BankAccount (String accountNumber, DollarAmount balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public BankAccount () {
		
	}
	
	//Methods
	public DollarAmount deposit(DollarAmount amountToDeposit) {
		balance = balance.plus(amountToDeposit);
		return balance;
	}
	
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		balance = balance.minus(amountToWithdraw);
		
		return balance;
	}
	
	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount) {
		
		this.withdraw(transferAmount);
		
		destinationAccount.deposit(transferAmount);
		
	}
	
	//getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public DollarAmount getBalance() {
		return balance;
	}
	

}
