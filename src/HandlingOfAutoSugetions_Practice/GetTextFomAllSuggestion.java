package HandlingOfAutoSugetions_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextFomAllSuggestion
{
	@Test
	public void Suggestion() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
	
		driver.findElement(By.name("q")).sendKeys("macbook air 1");
		
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//li[contains(@class,'_3D0G9a')]"));
		
		for(WebElement ele:all)
		{
			System.out.println(ele.getText());
		}
		
	}
	

}
