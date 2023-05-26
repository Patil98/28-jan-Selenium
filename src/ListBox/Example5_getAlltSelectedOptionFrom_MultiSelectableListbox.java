package ListBox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_getAlltSelectedOptionFrom_MultiSelectableListbox 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(2000);
		
		Select s=new Select(country);
		
		s.selectByIndex(0);
		s.selectByIndex(3);
		s.selectByIndex(2);
		
		List originallist =new ArrayList();
		
		List<WebElement> all = s.getAllSelectedOptions();
		//System.out.println(all.size());
		
		for(WebElement t:all)
		{
			System.out.println(t.getText());
		}		
	}

}
