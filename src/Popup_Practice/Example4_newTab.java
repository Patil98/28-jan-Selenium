package Popup_Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_newTab 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("opentab")).click();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(allids);
		
		driver.switchTo().window(a.get(1));

		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		
	}

}
