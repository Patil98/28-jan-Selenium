package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// handle nptification
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");

		//launch browser
		WebDriver driver=new ChromeDriver(co);

		//maximize browser
		driver.manage().window().maximize();

		//open URL
		driver.get("https://www.redbus.in/");

		//find date picker webelement to perform click action
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();

		while(driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText().contains("Sep")==false)
		{
			Thread.sleep(2000);

			//click on next btn
			driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).click();
			Thread.sleep(2000);
		}

		Thread.sleep(2000);
		List<WebElement> DayList = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']"));   		

		for(WebElement date:DayList)
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
