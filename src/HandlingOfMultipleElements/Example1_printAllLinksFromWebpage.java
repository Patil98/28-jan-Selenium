package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_printAllLinksFromWebpage 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		                            //driver.findElement(By.tagName("a"));
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(alllinks.size());
		System.out.println(alllinks.get(23).getText());
		
		for(WebElement s1:alllinks)
		{
			System.out.println(s1.getText());
			
		}
		
		
		
		
		
		
	}

}
