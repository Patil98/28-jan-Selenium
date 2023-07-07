package HandlingOfAutoSugetions_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma");
		Thread.sleep(1000);
		List<WebElement> alloption = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		Thread.sleep(1000);
		
		String exp="puma slides";
		
		for(WebElement w:alloption)
		{
			String act = w.getText();
			if(act.equals(exp))
			{
				w.click();
				break;
			}
		}
		
		
		
		
	}

}
