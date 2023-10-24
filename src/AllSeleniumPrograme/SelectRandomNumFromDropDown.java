package AllSeleniumPrograme;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SelectRandomNumFromDropDown 
{
	@Test
	public void dropdown()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.findElement(By.xpath("(//span[text()='All Classes'])[1]")).click();

		List<WebElement> ele = driver.findElements(By.xpath("//li[@role='option']/child::span"));

		String expectedname="First Class (FC)";
		for(WebElement all:ele)
		{
			String text = all.getText();
			if(text.equals(expectedname))
			{
				all.click();
				break;
			}
			
		}

	}

}
