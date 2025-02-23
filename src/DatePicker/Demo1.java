package DatePicker;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser
		WebDriver driver=new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//open URL
		driver.get("https://jqueryui.com/datepicker/");

		//switch to frame
		driver.switchTo().frame(0);

		//find date picker webelement to perform click action
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		String ExpectedDay="22";
		String ExpectedMonth="October";
		String ExpectedYear="2023";

		while(true)
		{
			String CalenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String CalenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(CalenderMonth.equals(ExpectedMonth)&& CalenderYear.equals(ExpectedYear))
			{
				List<WebElement> DayList = driver.findElements(By.xpath("//table/tbody/tr/td/a"));   		

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
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); --> next button
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); 
			}

		}
		Thread.sleep(5000);
		driver.quit();
	}
}