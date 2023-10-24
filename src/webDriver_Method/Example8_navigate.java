package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_navigate
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");

		//String a="https://www.amazon.in/";
		//.get(a);
		
		//String s="https://www.facebook.com/";
		//driver.navigate().to(s);
		
		
		driver.close();

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
			
	}









}
