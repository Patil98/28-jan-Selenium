package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example12_MultiBrowser_Testing 
{
	@Parameters("BrowserName")
	@Test
	public void TC1(String Browsername) throws InterruptedException 
	{
		WebDriver driver=null;
		
		if(Browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(Browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(Browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
	

}
