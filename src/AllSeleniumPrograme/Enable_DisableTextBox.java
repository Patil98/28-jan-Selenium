package AllSeleniumPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enable_DisableTextBox 
{
	@Test
	public void enable() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		
		//check element is enabled or not
		WebElement ele = driver.findElement(By.id("textinput-1"));
		boolean ena = ele.isEnabled();
		System.out.println(ena);
		if(ena)
		{
			System.out.println("is enabled");
		}
		else
		{
			System.out.println("is disabled");
		}
		
		//enabled ,disabled element    [removeAttribute('disabled');]
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('textinput-1').disabled=false");
		
		Thread.sleep(3000);
		driver.findElement(By.name("textinput-1")).sendKeys("bhushan");
		
		//check element is enabled or not
		WebElement elel = driver.findElement(By.id("textinput-1"));
		boolean enan = elel.isEnabled();
		System.out.println(enan);
		
		if(enan)
		{
			System.out.println("is enabled");
		}
		else
		{
			System.out.println("is disabled");
		}
	}

}
