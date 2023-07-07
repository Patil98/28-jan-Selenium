package Screenshot_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example4 
{
	
	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String rs = RandomString.make(2);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
	    File dest=new File("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\Screenshot\\\\abc"+rs+".jpg");
	    FileHandler.copy(src, dest);
		
	}

}
