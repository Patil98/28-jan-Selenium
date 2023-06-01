package ListBox_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_getAllOptionFromListBoxMultiSelectableListBox 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");
		
		WebElement sel = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(sel);
		
		List<WebElement> all = s.getOptions();
		
		for(WebElement s1:all)
		{
			System.out.println(s1.getText());
		}
		
		
	}

}
