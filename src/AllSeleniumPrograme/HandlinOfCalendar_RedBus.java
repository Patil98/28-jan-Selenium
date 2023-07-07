package AllSeleniumPrograme;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlinOfCalendar_RedBus 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// source
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("jalgaon");
		Thread.sleep(2000);
		
		//Dest
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("pune");
		Thread.sleep(2000);
		
		// open date menu
		driver.findElement(By.xpath("//text[contains(text(),'Date')]")).click();
		Thread.sleep(3000);
		
		////navigate to expected month -> Aug
		while(driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText().contains("Sep")==false)
		{
			Thread.sleep(2000);
			
			//click on next btn
			driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(1000);
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
		
		for(WebElement date:allDates)
		{
			Thread.sleep(2000);
			if(date.getText().contains("6"))
			{
				date.click();
				break;
			}
				
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
	
		
	}

}
