package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//img[@class='_396cs4'])[12]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
		
		String all = driver.getWindowHandle();
	
		driver.switchTo().window(all);
		
		//driver.findElement(By.xpath("(//img[@loading='eager'])[1]")).click();
		
		
		
		
	}

}
