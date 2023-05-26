package ListBox_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_getAlltSelectedOptionFrom_MultiSelectableListbox 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");
		
		WebElement c = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(c);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		List<WebElement> all = s.getAllSelectedOptions();
		
		for(WebElement w:all)
		{
			System.out.println(w.getText());
		}
		
		
	}

}
