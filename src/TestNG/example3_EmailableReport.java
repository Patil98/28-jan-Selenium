package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReport
{	
	@Test
	public void TC1()               //test case or test method
	{
		//System.out.println("running TC1 test case");
		Reporter.log("running TC1 test case", true);       //diffclassname.methodname("Message", true);
	}

	@Test
	public void TC2()               //test case or test method
	{
		//System.out.println("running TC2 test case");
		Reporter.log("running TC2 test case", true);
	}

	@Test
	public void TC3()               //test case or test method
	{
		//System.out.println("running TC3 test case");
		Reporter.log("running TC3 test case", true);
	}

	@Test
	public void TC4()               //test case or test method
	{
		//System.out.println("running TC3 test case");
		Reporter.log("running TC4 test case");
	}

	@Test
	public void TC5()               //test case or test method
	{
		System.out.println("running TC5 test case");
	}
}
