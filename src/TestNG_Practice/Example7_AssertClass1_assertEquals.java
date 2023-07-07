package TestNG_Practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_assertEquals 
{
	@Test
	public void TC1() 
	{
		String actResult="hello";
		String expResult="hi";
		
		assertEquals(actResult, expResult);  //className.methodname();
	}

}
