package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ScrollUpDown3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(2000);
		
		//scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		//scroll up
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
		
		
	}

}
