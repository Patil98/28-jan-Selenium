package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	@Test
	public void TC1() 
	{
		Reporter.log("---running TC1----" );
	}

	@Test
	public void TC2() 
	{
		Reporter.log("---running TC3----" );
	}
	
	@Test
	public void TC3() 
	{
		Reporter.log("---running TC3----");
	}


}
