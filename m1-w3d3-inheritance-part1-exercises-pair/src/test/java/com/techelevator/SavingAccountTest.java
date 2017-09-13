package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTest extends BankAccount {
	
	SavingAccount sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new SavingAccount();
		sut.deposit(new DollarAmount(20000));
	}

	@Test
	public void testBalanceAt200() {
		
		assertEquals("$200.00",sut.getBalance().toString());		
	}
	
	@Test
	public void testWithdrawOver150Limit() {
		
		assertEquals("$48.00", sut.withdraw(new DollarAmount(15000)).toString());
	}
	
	@Test
	public void testWithdrawMoreThanBalance() {
		
		assertEquals("$48.00", sut.withdraw(new DollarAmount(15000)).toString());
		assertEquals("$48.00", sut.withdraw(new DollarAmount(4900)).toString());
	}

}
