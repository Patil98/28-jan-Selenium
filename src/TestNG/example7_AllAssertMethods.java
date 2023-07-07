package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example7_AllAssertMethods
{
	
	@Test
	public void softAssert()
	{
	WebDriver driver = new ChromeDriver();
	
	SoftAssert softAssert = new SoftAssert();
	
	driver.navigate().to("https://www.amazon.in/");
	String getActualTitle = driver.getTitle();
	System.out.println(getActualTitle);
	 String exptitle = " site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
	 softAssert.assertEquals(getActualTitle, exptitle);
	 softAssert.assertNotEquals(getActualTitle, exptitle);
	 
	 softAssert.assertNull(getActualTitle);
	 softAssert.assertNotNull(getActualTitle);
	 softAssert.assertAll();
	 
	/*softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
	softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
	softAssert.assertAll();*/
	}

}
