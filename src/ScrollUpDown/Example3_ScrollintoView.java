package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_ScrollintoView 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement contactus = driver.findElement(By.xpath("//*[@id=\"rt-footer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/h4"));
		

		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",contactus);
		
		Thread.sleep(2000);
		
		WebElement tr = driver.findElement(By.xpath("//*[@id=\"rt-showcase\"]/div/div[1]/div/div/div/div/div[1]/div/div/h2/font"));
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",tr);
		
		
		
	}

}
