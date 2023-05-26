package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_ID
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/Id.html");
			
			Thread.sleep(3000);
			
			// enter Fname
			driver.findElement(By.id("1234")).sendKeys("bvp");
			
	     Thread.sleep(3000);
			
			// enter Lname
			driver.findElement(By.id("56789")).sendKeys("1234565");
			
			
		
	}
	
	

}
