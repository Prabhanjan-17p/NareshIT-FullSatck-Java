package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void testWithSmallNum() {
		double exc = 24000.0;

		SimpleIntrestCalculator sm = new SimpleIntrestCalculator();
		double interest = sm.calSimpleIntrest(100000, 2, 12);

		assertEquals(exc, interest);
	}

	@Test
	public void testWithLargeNum() {
		double exc = 600000.0;

		SimpleIntrestCalculator sm = new SimpleIntrestCalculator();
		double interest = sm.calSimpleIntrest(5000000, 3, 4);

		assertEquals(exc, interest);
	}

	@Test
	public void testWithZeroValues() {
		double exc = 0.0;

		SimpleIntrestCalculator sm = new SimpleIntrestCalculator();
		assertThrows(IllegalArgumentException.class, () -> sm.calSimpleIntrest(-100000, 1, 12),
				"Expecting Exception but it has not come.");
	}

	@Test
	public void testWithDecimalRate() {
		double exc = 5250.0;

		SimpleIntrestCalculator sm = new SimpleIntrestCalculator();
		double interest = sm.calSimpleIntrest(50000, 2, 5.25);

		assertEquals(exc, interest, 0.0);
	}

	@Test
	public void testWithNegativePrincipal() {
		SimpleIntrestCalculator sm = new SimpleIntrestCalculator();
		assertThrows(IllegalArgumentException.class, () -> sm.calSimpleIntrest(-100000, 1, 12),
				"Expecting Exception but it has not come.");
	}

	@Test
	public void testWithNegativeRate() {
		double exc = -24000.0;

		SimpleIntrestCalculator sm = new SimpleIntrestCalculator();
		assertThrows(IllegalArgumentException.class, () -> sm.calSimpleIntrest(-100000, 1, 12),
				"Expecting Exception but it has not come.");
	}
}
