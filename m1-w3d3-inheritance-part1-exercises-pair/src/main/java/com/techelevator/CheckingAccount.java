package com.techelevator;

public class CheckingAccount extends BankAccount {
		
	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		super.withdraw(amountToWithdraw);
		
		//As an example, first, we start with 10 bucks. Then we take out 100 bucks leaving us with
		//negative 90 bucks but then we incur a fee so we're left with -100 bucks.
		//Second, we attempt to take out an additional 20 bucks but exceed -100 dollars
		//so we cancel the transaction and are left with -100 dollars.
		
		if (super.getBalance().isLessThan(new DollarAmount(0))) {
			super.withdraw(new DollarAmount(1000));
			if (super.getBalance().isLessThan(new DollarAmount(-10000))) {
				
				// returns amount to withdraw and the fee that would've been incurred
				super.deposit(amountToWithdraw);
				super.deposit(new DollarAmount(1000));
			}
		} return getBalance();
	} 
}
