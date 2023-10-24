package AllSeleniumPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetEnabledIsDisabled
{
	@Test
	public void Check() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//enabled element
		boolean enabled = driver.findElement(By.name("email")).isEnabled();
		System.out.println(enabled);

		Thread.sleep(2000);

		//make enabled element,disabled
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').disabled=true");

		Thread.sleep(2000);

		//check is disabled or not
		WebElement el = driver.findElement(By.name("email"));
		boolean enabled2 = el.isEnabled();
		System.out.println(enabled2);
		//el.sendKeys("bhushan patil");

	}


}
