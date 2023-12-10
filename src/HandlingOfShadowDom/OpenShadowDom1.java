package HandlingOfShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenShadowDom1 
{
    @Test
	public void name() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://books-pwakit.appspot.com/");
//
//		//This Element is inside single shadow DOM.
//		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
//		Thread.sleep(1000);
//		shadow.findElement(By.cssSelector("#input")).sendKeys("Bhushan Patil");	
//		
//		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele = (WebElement) js.executeScript("return document.querySelector('body > book-app').shadowRoot.querySelector('#input');");
		js.executeScript("arguments[0].value='bhushan'",ele);
		
	}
}
