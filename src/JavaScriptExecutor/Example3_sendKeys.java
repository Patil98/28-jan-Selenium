package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_sendKeys 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
        
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.location='https://www.amazon.in/'");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		js.executeScript("document.getElementById('twotabsearchtextbox').value='shoes';");
		Thread.sleep(5000);
		
		js.executeScript("document.getElementById('nav-search-submit-button').click();");
		
	}

}
