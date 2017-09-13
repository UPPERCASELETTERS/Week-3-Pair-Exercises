package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount sut;
	BankAccount sut2;

	@Before
	public void setUp() throws Exception {
		sut= new BankAccount();
		sut2= new BankAccount();
	}

	@Test
	public void testBalanceIs0() {

		assertEquals("$0.00", sut.getBalance().toString());
	}
	
	@Test
	public void testDeposit10Dollars() {
		
		DollarAmount amountToDeposit = new DollarAmount(1000);		
		
		assertEquals("$10.00", sut.deposit(amountToDeposit).toString());
	}
	
	@Test
	public void testDeposit10cents() {
		
		DollarAmount amountToDeposit = new DollarAmount(10);		
		
		assertEquals("$0.10", sut.deposit(amountToDeposit).toString());
	}
	
	@Test
	public void testWithdrawUnderBalance() {
		DollarAmount amountToDeposit = new DollarAmount(1000);
		
		sut.deposit(amountToDeposit);
		
		DollarAmount amountToWithdraw = new DollarAmount(100);
		
		assertEquals("$9.00", sut.withdraw(amountToWithdraw).toString());
	}
	
	@Test
	public void testWithdrawOverBalance() {
		DollarAmount amountToDeposit = new DollarAmount(1000);
		
		sut.deposit(amountToDeposit);
		
		DollarAmount amountToWithdraw = new DollarAmount(1100);
		
		assertEquals("$-1.00", sut.withdraw(amountToWithdraw).toString());	
	}
	
	@Test
	public void testTransferUnderBalance() {
		DollarAmount amountToDeposit = new DollarAmount(1000);
		sut.deposit(amountToDeposit);
		
		DollarAmount amountToTransfer = new DollarAmount(1000);
		
		sut.transfer(sut2, amountToTransfer);
		
		assertEquals("$0.00", sut.getBalance().toString());
		assertEquals("$10.00", sut2.getBalance().toString());
	}
	
	@Test
	public void testTransferOverBalance() {
		DollarAmount amountToDeposit = new DollarAmount(1000);
		sut.deposit(amountToDeposit);
		
		DollarAmount amountToTransfer = new DollarAmount(1100);
		
		sut.transfer(sut2, amountToTransfer);
		
		assertEquals("$-1.00", sut.getBalance().toString());
		assertEquals("$11.00", sut2.getBalance().toString());
	}
}
