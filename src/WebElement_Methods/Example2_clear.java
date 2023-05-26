package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_clear

{

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhushan");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("patil");
		
		
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		
		UN.sendKeys("BHUSHAN");
		
		Thread.sleep(2000);
		
		UN.clear();
		
		Thread.sleep(2000);
		
		UN.sendKeys("patil");
				
				
				
	}
	
}
