package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups=("Smoke"))
	public void ploan()
	{
		System.out.println("good");
	
	}
	@BeforeTest
	public static void prereq()
	{
	System.out.println("I will execute first");
	}
	}
