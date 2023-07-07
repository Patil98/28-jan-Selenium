package AllSeleniumPrograme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinOfCalendar 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='k-svg-icon k-svg-i-calendar k-button-icon']")).click();
		
		// select a year
		while(driver.findElement(By.xpath("//span[@class='k-button-text']")).getText().contains("1998")==false)
		{
			Thread.sleep(2000);
			//click on back arrow btn
			driver.findElement(By.xpath("(//span[@aria-hidden='true'])[5]")).click();
		}
		
	}

}
