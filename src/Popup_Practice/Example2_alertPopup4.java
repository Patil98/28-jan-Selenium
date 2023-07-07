package Popup_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_alertPopup4 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys("bhushan");
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		
		String get = alt.getText();
		System.out.println(get);
		
		Thread.sleep(1000);
		//alt.accept();
		
		Thread.sleep(1000);
		
		alt.dismiss();
		
	}

}
