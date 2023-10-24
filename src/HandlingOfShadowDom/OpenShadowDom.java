package HandlingOfShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenShadowDom 
{
	@Test
	public void dom() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//This Element is inside 2 nested shadow DOM.
		//String cssSelectorForHost1 = "#userName";
		//String cssSelectorForHost2 = "#app2";
		
		SearchContext shadow0 = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#app2")).getShadowRoot();
		shadow1.findElement(By.cssSelector("#pizza")).sendKeys("chicken");
		
		
	}
	

}
