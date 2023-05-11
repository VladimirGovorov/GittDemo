package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL", "APIkey/username"})
	@Test
	public void webLoginCarLoan(String urlName, String key)
	{
		System.out.println("weblogincar");
	
		System.out.println(urlName);
		System.out.println(key);
	}
	@BeforeMethod
	public static void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class ");
	}
	@AfterMethod
	public static void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
     @AfterClass
	public static void Afterclass()
	{
		System.out.println("After executing all methods in the class");
	}

	
	@Test(groups=("Smoke"))
	public void mobileLogincarLoan()
	{
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public static void Bfsuite ()
	{
		System.out.println("I am no 1");
	}
	@Test(dependsOnMethods={"webLoginCarLoan", "mobilesignoutcarLoan"})
	public void APIcarLoan()
	{
		System.out.println("APIlogincar");
	}
	
	
	
	@Test(enabled=false)
	public void mobilesignincarLoan()
	{
		System.out.println("mobile SIGNIN");
	}
	
	@Test(dataProvider="getData")

	public void mobilesignoutcarLoan(String username, String password)
	{
		System.out.println("mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	

	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history = row
		//2nd combination - usernamee password - no credit history
		//3d combination - fraudulent credit history
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]="firstsetuusername";
		data[0][1]= "firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3d set
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword";
		return data;
}
}