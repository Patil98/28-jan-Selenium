package Selenium_Axes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Following_Axes 
{
	@Test
	public void Example1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushan@gmail.com");
		
		//enter pass using Following Axes 
		driver.findElement(By.xpath("//input[@id='email']//following::input[1]")).sendKeys("patil@123");
		
		
						
		//click on sign in Following Axes
		driver.findElement(By.xpath("//input[@id='email']//following::button")).click();
		
		
		
		
		
	}

}
