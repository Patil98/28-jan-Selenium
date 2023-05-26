package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getTitle

{
public static void main(String[] args)
{	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String s = driver.getTitle();
	System.out.println(s);
	
}
}
