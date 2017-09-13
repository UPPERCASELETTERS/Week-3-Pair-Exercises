package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest extends BankAccount {
	
	CheckingAccount sut; 

	@Before
	public void setUp() throws Exception {
		
		sut = new CheckingAccount();
		sut.deposit(new DollarAmount(1000));
	}
	
	@Test
	public void testBalanceAt10() {
		
		assertEquals("$10.00",sut.getBalance().toString());
	}
	
	@Test
	public void testWithdrawUnderBalance() {
		
		assertEquals("$5.00", sut.withdraw(new DollarAmount(500)).toString());
	}
	
	@Test
	public void testWithdrawOverBalance() {
		
		assertEquals("$-15.00", sut.withdraw(new DollarAmount(1500)).toString());
	}
	
	@Test
	public void testWithdrawMoreThanNegative100() {
		
		//First, we start with 10 bucks. Then we take out 100 bucks leaving us with
		//negative 90 bucks but then we incur a fee so we're left with -100 bucks.
		//Second, we attempt to take out an additional 20 bucks but exceed -100 dollars
		//so we cancel the transaction and are left with -100 dollars.
		
		assertEquals("$-100.00", sut.withdraw(new DollarAmount(10000)).toString());
		assertEquals("$-100.00", sut.withdraw(new DollarAmount(2000)).toString());
	}

}
