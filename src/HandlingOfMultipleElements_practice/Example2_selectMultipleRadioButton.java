package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_selectMultipleRadioButton 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> Radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement w:Radio)
		{
			w.click();
			Thread.sleep(1000);
		}
		
	}

}
