package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo4 
{
	public static void main(String[] args) 
	{
		//launch browser
		WebDriver driver=new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//open URL
		driver.get("https://www.goibibo.com/");

		//find date picker webelement to perform click action
		driver.findElement(By.xpath("//span[@class='sc-12foipm-21 lerOcM fswDownArrow']")).click();

		String ExpectedDay="22";
		String ExpectedMonthAndYear="October 2023";

		while(true)
		{
			String CalenderMonthAndYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();

			if (CalenderMonthAndYear.equals(ExpectedMonthAndYear))
			{
				List<WebElement> DayList = driver.findElements(By.xpath("//p[@class='fsw__date']"));   		

				for(WebElement e:DayList)
				{
					String CalenderDay = e.getText();

					if(CalenderDay.equals(ExpectedDay))
					{
						e.click();
						break;
					}
				}

				break;
			} 
			else 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}

		}

		// click on done button
		driver.findElement(By.xpath("//span[normalize-space()='Done']")).click();
	}

}
