package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_XpathByContainsUsingAttribute
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,' phone number')]")).sendKeys("bhushan");
		
		Thread.sleep(2000);
		
		//enter PWD
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("123456");

		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
		
		
		
		
		
		
}
	
	
}