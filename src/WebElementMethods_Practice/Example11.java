package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement r = driver.findElement(By.xpath("//input[@type='text']"));
		 r.sendKeys("bhushan");
		 
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("patil@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//font[text()='Log in'])[1]")).click();
		
	    r.clear();
	    
	  String text = driver.findElement(By.xpath("")).getText();
		
	  System.out.println(text);
		
	  
	}
	

}
