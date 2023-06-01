package HandlingOfAutoSugetions_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("redmi");
		Thread.sleep(1000);
		List<WebElement> get = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		String exp="redmi note 11";
		
		for(WebElement s:get)
		{
			String act = s.getText();
			
			if(act.equals(exp))
			{
				s.click();
				break;
			}
		}
		
		
		
	}

}
