package WebElementMethods_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class StaleElementException 
{
	@Test
	public void Exception() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement Element = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));		
		w.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(Element)));		
		
		Element.click();
	}

}
