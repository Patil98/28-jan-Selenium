package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_selectMultipleCheckboxes2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		 for(WebElement w:checkbox)
		 {
			 w.click();
			 Thread.sleep(600);
		 }
		 
		 for(int i=checkbox.size()-1; i>=0; i--)
		 {
			 checkbox.get(i).click();
			 Thread.sleep(600);
		 }
		 
		 
	}
}
