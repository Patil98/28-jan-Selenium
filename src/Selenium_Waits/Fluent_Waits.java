package Selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Fluent_Waits 
{
	
	@Test
	public void sample()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)	
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);
		
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='emai']"))).sendKeys("bhushan@gmail.com");
		
		
	}
	

}
