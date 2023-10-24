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
		driver.get("https://www.bpsc.bih.nic.in/");
		
		driver.findElement(By.xpath("(//a[@class='wbg'])[1]")).click();
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_S);
	
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_S);
		
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
