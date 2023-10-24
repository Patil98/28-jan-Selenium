package ListBox_Practice;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ValidateTheDropDownIsSortedOrNot 
{
	@Test
	public void Validate() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement india = driver.findElement(By.tagName("select"));

		Select se = new Select(india);

		ArrayList originalList = new ArrayList();
		ArrayList TemporaryList = new ArrayList();

		Thread.sleep(2000);

		for(WebElement all:se.getOptions())
		{
			originalList.add(all.getText());
			TemporaryList.add(all.getText());
		}

		System.out.println("originalList Before Sorting :"+originalList);
		System.out.println("TemporaryList Before Sorting :"+TemporaryList);

		Thread.sleep(2000);
		Collections.sort(originalList);
		Collections.sort(TemporaryList);
		
		Thread.sleep(2000);
		
		System.out.println("originalList After Sorting :"+originalList);		
		System.out.println("TemporaryList After Sorting :"+TemporaryList);

		Thread.sleep(2000);

		if(originalList.equals(TemporaryList))
		{
			System.out.println("DropDown is Sorted");
		}
		else
		{
			System.out.println("DropDown is Not Sorted");
		}

		Thread.sleep(2000);

		driver.close();


	}

}
