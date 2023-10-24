package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo5_UsingJS 
{
	@Test
	public void selectdate() 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//click on calender
		WebElement element = driver.findElement(By.xpath("(//span[@class='dateText'])[1]"));		
		js.executeScript("arguments[0].click();",element);
		
		//click on next 
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]"));
		for(int i=1; i<3; i++)
		{	
	    js.executeScript("arguments[0].click();",element1);	
		}
		
		//click on date
		WebElement element2 = driver.findElement(By.xpath("//span[normalize-space()='30']"));
		js.executeScript("arguments[0].click();",element2);
		
	}

}
