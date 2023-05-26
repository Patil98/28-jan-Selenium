package HandlingOfCustomizedListbox_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_select_year_OptionUsing_HomeKey
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		
		Actions act=new Actions(driver);
		
		act.click(year).perform();
		Thread.sleep(1000);
		
		
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		
		for(int i=1; i<=25; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
