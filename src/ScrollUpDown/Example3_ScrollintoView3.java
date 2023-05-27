package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_ScrollintoView3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(2000);
		
		WebElement get = driver.findElement(By.xpath("//table[@class='dataTable']//tr[26]/td[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",get);
		
		Thread.sleep(2000);
		
		WebElement ge = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[4]/a"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ge);
		
	}

}
