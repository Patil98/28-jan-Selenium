package Popup_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadExample
{
	@Test	
	public void upload() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\bvp13\\Downloads\\12-agile-principles.png");
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-submit")).click();	
	}

}
