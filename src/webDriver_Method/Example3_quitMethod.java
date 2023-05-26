package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_quitMethod
{

		public static void main(String[] args) throws InterruptedException
		
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
		    Thread.sleep(5000);
			driver.get("https://www.instagram.com/");
			
		    Thread.sleep(5000);
		    
			driver.get("https://www.facebook.com/");
			
		    Thread.sleep(5000);
		    
		    
			driver.get("https://www.amazon.com/");
			
		    Thread.sleep(5000);
		    

		    
		    driver.quit();
		    
		}
	
	
	
}