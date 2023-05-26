package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1_getMethod

{

	public static void main(String[] args)
	
	{
		WebDriver driver=new EdgeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		
		
	}
}
