package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload1 
{
	public static void main(String[] args) throws InterruptedException {
		

	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	
	driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\bvp13\\OneDrive\\Documents\\SDLC - Waterfall Model.pdf");
	Thread.sleep(2000);
	
	driver.findElement(By.id("terms")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("submitbutton")).click();
	

}
}