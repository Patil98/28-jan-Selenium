package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getFirstSelectedOptionFrom_MultiSelectableListbox 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");
		
		Thread.sleep(2000);
		
		WebElement c = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Thread.sleep(2000);
		
		Select s=new Select(c);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(0);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	}

}
