package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	WebDriver driver;
	
	
	public void IntializeBrowser(String Browsername) throws IOException
	{
		
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
	
			driver.get(UtilityClass.getPFData("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

}
