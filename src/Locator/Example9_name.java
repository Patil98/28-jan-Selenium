package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_name 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/name.html");
		
		Thread.sleep(3000);
		
		// enter Fname
		driver.findElement(By.name("xyz123")).sendKeys("bhushan");
		
     Thread.sleep(3000);
		
		// enter Lname
		driver.findElement(By.name("fgh568")).sendKeys("patil");
		
}
}