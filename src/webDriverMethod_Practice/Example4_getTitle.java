package webDriverMethod_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getTitle 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
