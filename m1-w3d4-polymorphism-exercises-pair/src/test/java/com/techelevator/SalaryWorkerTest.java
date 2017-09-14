package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {
	
	SalaryWorker sut;

	@Before
	public void setUp() throws Exception {
		int randomNum = ((int) (Math.random()*100+10));
		sut = new SalaryWorker(50000.00);
		sut.setFirstName("John");
		sut.setLastName("Smith");
		sut.setHoursWorked(randomNum);
		sut.calculateWeeklyPay(randomNum);
		
		
	}

	@Test
	public void testConstructor() {
		assertEquals(50000.0, sut.getAnnualSalary(), 0D);
		assertEquals("John", sut.getFirstName());
		assertEquals("Smith", sut.getLastName());
		
	}
	
	@Test
	public void testCalculateWeeklyPay() {
		
		assertEquals(50000.0/52, sut.getWeeklyPay(), 0D);
		
	}
		
}
