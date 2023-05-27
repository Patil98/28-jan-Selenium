package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//img[@class='_396cs4'])[12]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
		
		String all = driver.getWindowHandle();
	
		Thread.sleep(1000);
		
		Set<String> get = driver.getWindowHandles();
	    ArrayList<String> b=new ArrayList<String>(get);
	        
	        
	     driver.switchTo().window(b.get(1));
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	     Thread.sleep(3000);
	     
	     driver.switchTo().window(b.get(0));
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("(//div[@class='CXW8mj'])[3]")).click();
	     
	 
	   
		
		
		
		
	}

}
