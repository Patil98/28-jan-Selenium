package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example5_TestNGKeyword4_Timeouts 
{
	
	@Test(timeOut = 10000)
	public void TC1() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
		
	}
	

}
