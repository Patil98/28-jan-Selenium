package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotations 
{

	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("---open browser---", true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--login to app--", true);
	}
	
	@Test
	public void varifyfullname1()
	{
		Reporter.log("running varifyfullname1 TC ", true);
	}
	
	@Test
	public void varifyfullname2()
	{
		Reporter.log("running varifyfullname2 TC ", true);
	}
	
	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("---logout fron App---", true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("---Close the browser-----", true);
	}


}
