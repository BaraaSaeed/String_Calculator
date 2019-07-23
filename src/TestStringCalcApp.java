import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

class TestStringCalcApp {

	@Test
	void testAddWithEmptyString() {
		StringCalcApp stringCal = new StringCalcApp();
		String expected = "0";
		String actual = stringCal.add("");
		assertEquals(expected, actual);
	}

	@Test
	void testAddWithTwoDoubles() {
		StringCalcApp stringCal = new StringCalcApp();
		String expected = "18.20";
		String actual = stringCal.add("2.3,1.5,6.5,7.9");
		assertEquals(expected, actual);
	}

	@Test
	void testAddWithTwoInts() {
		StringCalcApp stringCal = new StringCalcApp();
		String expected = "10";
		String actual = stringCal.add("1,2,3,4");
		assertEquals(expected, actual);
	}

	@Test
	void testAddWithOneInt() {
		StringCalcApp stringCal = new StringCalcApp();
		String expected = "1";
		String actual = stringCal.add("1");
		assertEquals(expected, actual);
	}

	@Test
	void testAddWithOneDouble() {
		StringCalcApp stringCal = new StringCalcApp();
		String expected = "3.5";
		String actual = stringCal.add("3.5");
		assertEquals(expected, actual);
	}

	@Test
	void testNewLineAsSep() {
		StringCalcApp stringCal = new StringCalcApp();
		String expected = "210.20";
		String actual = stringCal.add("175.2\n35");
		assertEquals(expected, actual);
	}
}
