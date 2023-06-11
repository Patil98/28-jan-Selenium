package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example7_AllAssertMethods
{
	
	@Test
	public void softAssert()
	{
	WebDriver driver = new ChromeDriver();
	
	SoftAssert softAssert = new SoftAssert();
	
	driver.navigate().to("https://www.browserstack.com/");
	String getActualTitle = driver.getTitle();
	System.out.println(getActualTitle);
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	
	//softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	softAssert.assertNotEquals(getActualTitle , "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	/*softAssert.assertNull(verifyTitle);
	softAssert.assertNotNull(verifyTitle);
	softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
	softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
	softAssert.assertAll(); */
	}

}
