package ChroPath_SelectorHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorHub 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9075111787");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("patil@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		*/
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9075111787");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("patil@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
