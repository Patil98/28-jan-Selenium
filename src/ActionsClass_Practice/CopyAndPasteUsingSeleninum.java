package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPasteUsingSeleninum 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement copy = driver.findElement(By.id("email"));
		copy.sendKeys("bhushan");
		Thread.sleep(3000);
		copy.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(3000);
		copy.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL,"v");
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
	}
	

}
