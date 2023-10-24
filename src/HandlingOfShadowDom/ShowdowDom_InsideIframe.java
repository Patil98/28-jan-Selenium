package HandlingOfShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShowdowDom_InsideIframe
{
    @Test
	public void name() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		//Switch to frame
		driver.switchTo().frame("pact");
		
		//ShodowDOM
		driver.findElement(By.cssSelector("#jest")).click();
		
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys("bhushanpatil").perform();
		
	}
}
