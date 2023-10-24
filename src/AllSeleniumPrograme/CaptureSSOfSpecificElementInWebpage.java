package AllSeleniumPrograme;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class CaptureSSOfSpecificElementInWebpage
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//img[4]"));

		File src = ele.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File dest=new File("C:\\Users\\bvp13\\OneDrive\\Documents\\Screenshot\\insta.jpg");
		FileUtils.copyFile(src, dest);

		Thread.sleep(3000);

		driver.quit();

	}

}
