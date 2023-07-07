package Iframe_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1_SwitchToFrame2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("courses-iframe");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Job Support']")).click();
		
		driver.switchTo().parentFrame();

		Thread.sleep(1000);
		
		driver.findElement(By.id("opentab")).click();
		
		
		
		
		
		
		
	}

}
