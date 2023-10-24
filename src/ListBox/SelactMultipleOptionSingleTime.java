package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelactMultipleOptionSingleTime 
{	
	public static void main(String[] args)
	{	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement day = driver.findElement(By.id("day"));
		list(day, "6");
		
		WebElement month = driver.findElement(By.id("month"));
		list(month, "Oct");
		
		WebElement year = driver.findElement(By.id("year"));
		list(year, "2021");

	}

	public static void list(WebElement element,String value) 
	{
		Select se = new Select(element);
		//se.selectByVisibleText(value);
		
		List<WebElement> options = se.getOptions();
		for(WebElement all:options)
		{
			if(all.getText().equals(value))
			{
				all.click();
				break;
			}
		}

	}

}
