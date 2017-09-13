package com.techelevator;

public class SavingAccount extends BankAccount {
	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		super.withdraw(amountToWithdraw);
		
		if (super.getBalance().isLessThan(new DollarAmount(15000))) {
			super.withdraw(new DollarAmount(200));
			if (super.getBalance().isLessThan(new DollarAmount(0))) {
				
				// returns amount to withdraw and the fee that would've been incurred
				super.deposit(amountToWithdraw);
				super.deposit(new DollarAmount(200));
			}
		} return getBalance();
	} 
}
