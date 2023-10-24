package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ScrollUpDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		//scroll down :->  1st parameter: 0,  2nd parameter: +ve     //pixel
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");

		Thread.sleep(2000);

		//scroll up :->  1st parameter: 0,  2nd parameter: -ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2000)");

	}

}
