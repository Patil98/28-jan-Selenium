package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\bvp13\\OneDrive\\Documents\\SDLC - Waterfall Model.pdf");
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		
	}

}
