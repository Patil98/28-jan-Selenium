package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass4_assertFalse
{
	@Test
	public void TC4() 
	{
		boolean actResult = false;
		
		Assert.assertFalse(actResult,"Failed: act result is true- ");
	}

}
