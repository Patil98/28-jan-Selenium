package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_assertNotEquals 
{
	@Test
	public void TC2() 
	{
		String actResult="hi";
		String expResult="ho";
		
		Assert.assertNotEquals(actResult, expResult);
	}

}
