package ListBox_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example7_SelectOptionFromSingleSelectableListbox 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement allcategery = driver.findElement(By.id("gh-cat"));

		Select select = new Select(allcategery);

		select.selectByVisibleText("Cameras & Photo");

		int size = select.getOptions().size();
		System.out.println(size);

		ArrayList al= new ArrayList();
		List<WebElement> options = select.getOptions();
		for(WebElement all:options)
		{
			al.add(all.getText());
		
		}
	
		Collections.sort(al);
		System.out.println(al);
		
//		String text1 = select.getFirstSelectedOption().getText();
//		System.out.println(text1);



		driver.close();
	}

}
