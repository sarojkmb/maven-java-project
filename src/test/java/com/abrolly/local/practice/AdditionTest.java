package com.abrolly.local.practice;

import junit.framework.TestCase;


public class AdditionTest extends TestCase {
	
	addition cal = new addition();
	public AdditionTest(String AddingTest)
	{
		super(AddingTest);
	}	
	public void TestTheSum()
	{
		int result= cal.sum(1,9);
		System.out.println("result"+result);
		assertEquals(10,result);
	
	}
	
	

}
