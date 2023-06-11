package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword1_invocationCount 
{
	
	@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("---running TC1----", true);
	}
	
	@Test(invocationCount=2)
	public void TC2()
	{
		Reporter.log("---running TC2----", true);
	}
	

}
