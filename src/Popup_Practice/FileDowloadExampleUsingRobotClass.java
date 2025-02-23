package Popup_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllSeleniumPrograme.Tread_Count_Example1;

public class FileDowloadExampleUsingRobotClass 
{
	@Test
	public void file() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://bpsc.bihar.gov.in/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sub-divisional Agriculture Office')]")).click();
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_S);
	
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_S);
		
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(3000);
		driver.quit();
		
	}

}
