package Iframe_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToFrame1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(2000);
		
		//driver.switchTo().frame(3);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@wmode='transparent']")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
		
		
	}

}
