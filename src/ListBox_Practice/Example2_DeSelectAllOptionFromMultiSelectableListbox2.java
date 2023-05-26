package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_DeSelectAllOptionFromMultiSelectableListbox2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");
		
		WebElement c = driver.findElement(By.xpath("//select[@id='1234']"));
		
       Select s=new Select(c);
       s.selectByIndex(0);
		s.selectByVisibleText("Aus");
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.deselectAll();
		
	}

}
