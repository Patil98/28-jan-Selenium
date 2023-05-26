package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_XpathByAttribute 
{
	
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushan@gmail.com");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
	
}	

}