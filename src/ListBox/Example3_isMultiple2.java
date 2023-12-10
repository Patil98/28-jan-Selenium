package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_isMultiple2

{
	public static void main(String[] args)
	{

		WebDriver driver =new ChromeDriver();

		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/multiselect.html");


		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));

		Select s=new Select(country);

		boolean result = s.isMultiple();

		System.out.println(result);

		if(result)
		{
			System.out.println("listbox is of multi-selectable");
		}
		else
		{
			System.out.println("listbox is of single-selectable");
		}


	}
}
