package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_assertNotEquals 
{
	@Test
	public void TC2() 
	{
		String actResult="hi";
		String expResult="hello";
		
		Assert.assertNotEquals(actResult, expResult, "failed - if both result are Equal");
	}

}
