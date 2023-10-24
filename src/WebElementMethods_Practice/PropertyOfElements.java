package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyOfElements 
{
	@Test
	public void name() 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");


		String css = driver.findElement(By.id("nav-search-submit-button")).getCssValue("color");
		System.out.println(css);
	}
}