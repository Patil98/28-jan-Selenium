package HandlingOfCustomizedListbox_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_select_day_OptionUsing_EndKey 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	  
	 WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
	 
	 Actions act=new Actions(driver);
	 Thread.sleep(1000);
	 
	 act.click(day).perform();
	 Thread.sleep(1000);
	 
	 act.sendKeys(Keys.END).perform();
	 
	 for(int i=1; i<=9; i++)
	 {
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
	 }
	 
	 act.sendKeys(Keys.ENTER).perform();
	  
	  
	  
	
}

}
