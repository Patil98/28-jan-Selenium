package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_isEnabled1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is disabled");	
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
