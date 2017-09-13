package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DollarAmountTest {

	DollarAmount sut;
	
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testToStringfor9Cents() {
		sut= new DollarAmount(9);
				
		String result = sut.toString();
		assertEquals("$0.09", result);
	}
	@Test
	public void testToStringfor89Cents() {
		sut= new DollarAmount(89);
				
		String result = sut.toString();
		assertEquals("$0.89", result);
	}
	@Test
	public void testToStringfor10Dollars() {
		sut= new DollarAmount(1000);
				
		String result = sut.toString();
		assertEquals("$10.00", result);
	}

}
