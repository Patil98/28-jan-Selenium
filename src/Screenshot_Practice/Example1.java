package Screenshot_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example1
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		String rs = RandomString.make(2);
		
		File srec = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(srec);
		
		File dest=new File("C:\\Users\\bvp13\\OneDrive\\Documents\\Screenshot\\abc"+rs+".jpg");
		
		FileHandler.copy(srec, dest);
		
		
		
		
	}

	

}
