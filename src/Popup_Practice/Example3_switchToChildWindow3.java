package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow3 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(allids);
		
		driver.switchTo().window(a.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		Thread.sleep(1000);
		driver.switchTo().window(a.get(0));
		
		driver.findElement(By.id("opentab")).click();
		
		
		
		
	}

}
