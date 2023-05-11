package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	
	
	@AfterTest
	public static void lastexecution()
	{
		System.out.println("I will execute last");
	}
	
	
	@Test
	public void demo()
	{
	
		System.out.println("hello");
		//Assert.assertTrue(false);
	}
	@AfterSuite
	public static void afsuite()
	{
		System.out.println("I am dead last");
	}
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}
	
	
	
	
}
