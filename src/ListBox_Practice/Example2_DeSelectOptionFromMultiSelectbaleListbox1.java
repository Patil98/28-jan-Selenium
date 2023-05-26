package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_DeSelectOptionFromMultiSelectbaleListbox1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");
		
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select (c);
		s.selectByIndex(0);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.deselectByIndex(0);
		s.deselectByIndex(1);
		
	
	}
}
