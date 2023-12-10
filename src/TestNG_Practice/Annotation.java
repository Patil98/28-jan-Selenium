package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotation 
{

	@BeforeClass
	public void openBrowser()
	{
	   Reporter.log("--open the browser---", true);	
	}
	
	 @BeforeMethod
	public void login() 
    {
    	Reporter.log("--login in the application---", true);	
	}
    
	
    @Test
    public void TC1()
    {
    	Reporter.log("--running the test case1---", true);
	}
	
    @Test
    public void TC2()
    {
    	Reporter.log("--running the test case2---", true);
	}
	
    @AfterMethod
    public void logout() 
    {
    	Reporter.log("--logout from the application---", true);	
	}
    
    @AfterClass
    public void CloseBrowser()
	{
	   Reporter.log("--Close the browser---", true);	
	}
    
    
}
