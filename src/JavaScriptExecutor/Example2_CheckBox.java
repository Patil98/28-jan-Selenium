package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_CheckBox 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('vfb-7-1').checked='Falls';");
		
		js.executeScript("document.getElementById('vfb-6-0').checked='true';");
		
		js.executeScript("document.getElementById('vfb-6-1').checked='true';");
		
		js.executeScript("document.getElementById('vfb-6-2').checked='true';");
	}
	
}
