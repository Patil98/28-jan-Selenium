package HandlingOfMultipleElements;

import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example5_selectMultipleCheckboxes 
{

	@Test
	public void checkbox()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/Handling%20of%20Multiple%20Elements.html");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int Allcheckbox = ele.size();
		
	    //select last 3 checkbox
		//(totalcheckbox-last 3 checkbox)
		
		for(int i=Allcheckbox-4; i<Allcheckbox; i++)
		{
			ele.get(i).click();
		}		
	}

}
