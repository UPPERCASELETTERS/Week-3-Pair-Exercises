package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VolunteerWorkerTest {

	VolunteerWorker sut;

	@Before
	public void setUp() throws Exception {
		
		sut = new VolunteerWorker();
		sut.setFirstName("John");
		sut.setLastName("Smith");
			
	}

	@Test
	public void testConstructor() {
		
		assertEquals("John", sut.getFirstName());
		assertEquals("Smith", sut.getLastName());
		
	}
	
	@Test
	public void testCalculateWeeklyPayWithoutOvertime() {
		
		
		sut.calculateWeeklyPay(50);
		assertEquals( 0.0 , sut.getWeeklyPay(), 0D);
		
	}

}
