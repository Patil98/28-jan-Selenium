package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_XpathByContainsUsingText1
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		// click on forgotten pwd
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		
		
	}
}
