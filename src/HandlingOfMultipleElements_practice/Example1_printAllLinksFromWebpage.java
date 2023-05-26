package HandlingOfMultipleElements_practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_printAllLinksFromWebpage 
{
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
	
		for(WebElement s1:links)
		{
			System.out.println(s1.getText());
		}
		
	}

}
