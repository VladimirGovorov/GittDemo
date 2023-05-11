package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups=("Smoke"))
	public void ploan()
	{
		System.out.println("good");
		System.out.println("bad");
		System.out.println("amazing");
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
	
	}
	@BeforeTest
	public static void prereq()
	{
	System.out.println("I will execute first");
	System.out.println("will execute last");
	System.out.println("I will execute second");
	}
	
	
	@BeforeTest
	public static void prereq2()
	{
	System.out.println("I will execute first");
	System.out.println("will execute last");
	System.out.println("I will execute second");
	}
	}
