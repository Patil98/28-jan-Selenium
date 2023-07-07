package Selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_Waits1 
{
	@Test
	public void sample() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		
		sendkey(driver, email, 5, "bhushan@gmail.com");
		sendkey(driver, pwd, 5, "patil@123");
		
		click(driver, submit, 5);
		
	}
	
	public static void sendkey(WebDriver driver,WebElement element, int time, String value) 
	{
		new WebDriverWait(driver, Duration.ofSeconds(time))
		.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
	}
	
	public static void click(WebDriver driver,WebElement element, int time) 
	{
		new WebDriverWait(driver, Duration.ofSeconds(time))
		.until(ExpectedConditions.visibilityOf(element)).click();	
		
	}
	
	

}
