package AllSeleniumPrograme;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSSOfSpecificSectionInWebpage 
{
	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// find x-path of that section
		WebElement section = driver.findElement(By.xpath("(//div[@class='rt-block'])[1]"));
		
		// take screenshot of that section
		File src = section.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\bvp13\\OneDrive\\Documents\\Screenshot\\guru99.jpg");
		FileUtils.copyFile(src, dest);
		
		
		driver.close();
		
	}

}
