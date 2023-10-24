package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_selectDeselectMultipleCheckboxes
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/Handling%20of%20Multiple%20Elements.html");
		
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckbox.size());
		
		//select all checkboxes
		for(WebElement s1:allcheckbox)
		{
			s1.click();
			Thread.sleep(500);
		}
		
		
		//de-select all checkboxes
		for(int i=allcheckbox.size()-1; i>=0; i--)
		{
			allcheckbox.get(i).click();
			Thread.sleep(200);
		}
		
		
		
		
		
	}

}
