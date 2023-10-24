package AllSeleniumPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get 
{
	@Test
	public void getattribute() throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement ele = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		driver.executeScript("window.scrollBy(0,1000)");
		
		ele.sendKeys("bhushan");;
		Thread.sleep(2000);
		System.out.println(ele.getAttribute("id"));
	
	
		
	
	
	}

}
