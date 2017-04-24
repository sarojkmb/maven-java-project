package com.abrolly.local.practice;

import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {

	Addition cal = new Addition();

	public AdditionTest(String AddingTest) {
		super(AddingTest);
	}
	
	@Test
	public void testSum() {
		int result = cal.sum(1, 9);
		System.out.println("result" + result);
		assertEquals(10, result);

	}

}
