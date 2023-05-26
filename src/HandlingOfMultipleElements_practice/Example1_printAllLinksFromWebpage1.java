package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_printAllLinksFromWebpage1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> all = driver.findElements(By.xpath("//a"));
		System.out.println(all.size());
		
		for(WebElement s:all)
		{
			System.out.println(s.getText());
		}
		
		
		
		
		
		
		
	}

}
