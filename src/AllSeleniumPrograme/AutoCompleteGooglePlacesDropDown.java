package AllSeleniumPrograme;

import java.awt.image.CropImageFilter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoCompleteGooglePlacesDropDown
{
	@Test
	public void Option() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();		
		
		WebElement option = driver.findElement(By.id("autocomplete"));
		option.clear();
		option.sendKeys("india");

		String value;
		do
		{
			option.sendKeys(Keys.ARROW_DOWN);
			value = option.getAttribute("value");
			if(value.equals("India Gate, New Delhi, Delhi, India"))
			{
				option.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);
		}
		while(!value.isEmpty());
		
	}

}
