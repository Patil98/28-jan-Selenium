package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_DisableTCExecutionFromTestSuite2_1
{
	@Test
	public void TC5()
	{
		Reporter.log("--running TC5--",true);
	}

	@Test
	public void TC6()
	{
		Reporter.log("--running TC6--",true);
	}

	@Test
	public void TC7()
	{
		Reporter.log("--running TC7--",true);
	}

	@Test
	public void TC8()
	{
		Reporter.log("--running TC8--",true);
	}

}
