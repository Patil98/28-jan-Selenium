package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_Name_facebook
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//enter name
		driver.findElement(By.xpath("(//font[contains(text(),'Log')])[1]]")).click();
//		
//     Thread.sleep(3000);
//		
//		// enter Lname
//		driver.findElement(By.xpath("(//input[contains(@class,'_6luy')])[2]")).sendKeys("patil");
		
	}
}