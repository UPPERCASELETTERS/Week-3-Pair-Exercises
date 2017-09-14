package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {

	HourlyWorker sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new HourlyWorker(10.00);
		sut.setFirstName("John");
		sut.setLastName("Smith");
			
	}

	@Test
	public void testConstructor() {
		
		sut.calculateHourlyPay(10);
		assertEquals(10.0, sut.getHourlyRate(), 0D);
		assertEquals("John", sut.getFirstName());
		assertEquals("Smith", sut.getLastName());
		
	}
	
	@Test
	public void testCalculateWeeklyPayWithoutOvertime() {
		
		
		sut.calculateHourlyPay(50);
		assertEquals( 550.0 , sut.getWeeklyPay(), 0D);
		
	}

}
