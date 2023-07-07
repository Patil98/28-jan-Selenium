package HandlingOfCustomizedListbox_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example1_select_date_OptionUsing_HomeKey1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		day.click();
		
		day.sendKeys(Keys.HOME);
		Thread.sleep(1000);
		
		for(int i=1; i<20; i++)
		{
			day.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(100);
		}
		
		Thread.sleep(1000);
		day.sendKeys(Keys.ENTER);
			
	}
}
