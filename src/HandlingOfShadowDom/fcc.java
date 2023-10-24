package HandlingOfShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fcc 
{
	

    @Test
	public void Dom() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");

		// click on shadow host 
		driver.findElement(By.cssSelector("#jest")).click();
		
		// action class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys("green tea+").perform();
			
			
	}


}
