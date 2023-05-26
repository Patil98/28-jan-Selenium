package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_selectMultipleCheckboxes1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/Handling%20of%20Multiple%20Elements.html");
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());
		
		for(WebElement s:all)
		{
			s.click();
			Thread.sleep(500);
		}
		
		for(int i=all.size()-1; i>=0; i--)
		{
			all.get(i).click();
			Thread.sleep(500);
		}
		
		
		
		
		
		
		
		
	}

}
