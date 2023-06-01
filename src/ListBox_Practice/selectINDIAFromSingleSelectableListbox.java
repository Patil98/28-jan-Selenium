package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectINDIAFromSingleSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		
		WebElement india = driver.findElement(By.tagName("select"));
		
		Thread.sleep(2000);
		
		Select s=new Select(india);
		
		//s.selectByValue("IND");
		s.selectByVisibleText("India");
	}
}
