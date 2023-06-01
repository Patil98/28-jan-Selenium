package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_sendKeys
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
	   Thread.sleep(2000);
	
	  ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value','shirts')",ele);
	
	  Thread.sleep(2000);
	
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	
	  
	}
	

}
