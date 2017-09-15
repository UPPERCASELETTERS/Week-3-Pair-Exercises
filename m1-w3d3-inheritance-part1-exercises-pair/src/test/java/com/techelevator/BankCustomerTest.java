package com.techelevator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	
	BankCustomer sut;
	List <BankAccount> listOfAccountsForSut = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		//List <BankAccount> listOfAccountsForSut = new ArrayList<>();
		sut = new BankCustomer("Fred", "Here", "9-1-1");
		
	}

	@Test
	public void testConstructor() {
		assertEquals("Fred", sut.getName());
		assertEquals("Here", sut.getAddress());
		assertEquals("9-1-1", sut.getPhoneNumber());
	}
	
	@Test
	public void testAddMultipleAccounts()  {
		
		BankAccount sutBank = new BankAccount("12345");
		CheckingAccount sutCheck = new CheckingAccount();
		SavingAccount sutSaving = new SavingAccount();

		sut.addAccount(sutBank);
		sut.addAccount(sutCheck);
		sut.addAccount(sutSaving);
		BankAccount[] accs = sut.getAccounts();
				
		assertEquals("12345", accs[0].getAccountNumber());
		assertEquals(null, accs[1].getAccountNumber());
		assertEquals(null, accs[2].getAccountNumber());
	}
	
	@Test
	public void isVIPtrue() {
		
		BankAccount sutBank = new BankAccount("12345");
		CheckingAccount sutCheck = new CheckingAccount();
		SavingAccount sutSaving = new SavingAccount();

		sut.addAccount(sutBank);
		sut.addAccount(sutCheck);
		sut.addAccount(sutSaving);
			
		sutCheck.deposit(new DollarAmount(1250000));		
		sutSaving.deposit(new DollarAmount(1250000));
		
		assertEquals("$12500.00", sutCheck.getBalance().toString());
		assertEquals("$12500.00", sutSaving.getBalance().toString());
		
		assertEquals(true, sut.isVIP());
	}
		
	@Test
	public void isVIPfalse() {
			
		BankAccount sutBank = new BankAccount("12345");
		CheckingAccount sutCheck = new CheckingAccount();
		SavingAccount sutSaving = new SavingAccount();

		sut.addAccount(sutBank);
		sut.addAccount(sutCheck);
		sut.addAccount(sutSaving);
				
		sutCheck.deposit(new DollarAmount(1200000));		
		sutSaving.deposit(new DollarAmount(1200000));
			
		assertEquals("$12000.00", sutCheck.getBalance().toString());
		assertEquals("$12000.00", sutSaving.getBalance().toString());
			
		assertEquals(false, sut.isVIP());	
	}
}
