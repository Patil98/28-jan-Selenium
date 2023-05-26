package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_Tagname 


{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/tagname.html");
		
		Thread.sleep(3000);
		
		// enter Fname
		driver.findElement(By.tagName("input")).sendKeys("bhushan");
		
     Thread.sleep(3000);
		
		// enter Lname
		driver.findElement(By.tagName("input")).sendKeys("patil");
		
		
		
	}
	
}
