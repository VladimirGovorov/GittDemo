package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String urlName)
	{
		System.out.println("webloginhomePersonalLoan");
		System.out.println(urlName);
	}

	@Test(groups=("Smoke"))
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobileloginhome");
	}
	@Test
	public void loginAPIHomeLoan()
	{
		System.out.println("loginapihome");
	}
	
	@Test
	public void loginAPIHomeLoan2()
	{
		System.out.println("loginapihome");
	}
}
