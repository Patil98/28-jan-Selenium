package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_sendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	
	{  
		WebDriver driver = new ChromeDriver();
	
	  driver.get("https://www.amazon.in/");
	  
	 // driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  //Javascript command
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('twotabsearchtextbox').value='shoes';");
	  	  
	  Thread.sleep(5000);
	  
	  //driver.close();
	  
	 // driver.quit();

		
	}

}
