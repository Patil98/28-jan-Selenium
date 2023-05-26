package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_GetCurrentURL 
{
	
	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 String url= driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
