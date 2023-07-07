package ChroPath_SelectorHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChroPath 
{
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
      /* driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushan");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("patil");
        driver.findElement(By.tagName("button")).click();
        */
        
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushan");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("patil");
		driver.findElement(By.tagName("button")).click();
		
	}

}
