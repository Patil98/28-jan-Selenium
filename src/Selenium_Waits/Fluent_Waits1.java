package Selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Fluent_Waits1 
{
    @Test
	public void sendkey() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		
		sendkey(driver, email, 10, 2, "bhushan@gmail.com");
		sendkey(driver, pwd, 10, 2, "patil@123");
		click(driver, submit, 10, 2);
	}
	
	
	public static void sendkey(WebDriver driver,WebElement element, int time,int freq, String value) 
	{
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)	
				.withTimeout(Duration.ofSeconds(time))
				.pollingEvery(Duration.ofSeconds(freq))
				.ignoring(NoSuchElementException.class);
				
		   wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
				
	}
	
	public static void click(WebDriver driver,WebElement element, int time,int freq) 
	{
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)	
				.withTimeout(Duration.ofSeconds(time))
				.pollingEvery(Duration.ofSeconds(freq))
				.ignoring(NoSuchElementException.class);
				
		   wait.until(ExpectedConditions.visibilityOf(element)).click();	
		
	}
	
}
