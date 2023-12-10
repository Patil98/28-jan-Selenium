package HandlingOfShadowDom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowRootUsing_Js 
{
	@Test
	public void name()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://shop.polymer-project.org/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele = (WebElement) js.executeScript("return document.querySelector('body > shop-app').shadowRoot.querySelector('iron-pages > shop-home').shadowRoot.querySelector('div:nth-child(2) > shop-button > a')");
		js.executeScript("arguments[0].click();",ele);
		
	}

}
