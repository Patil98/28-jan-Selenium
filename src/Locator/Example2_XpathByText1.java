package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_XpathByText1
{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		
	}

}
