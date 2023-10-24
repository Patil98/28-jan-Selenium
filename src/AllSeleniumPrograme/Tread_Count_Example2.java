package AllSeleniumPrograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tread_Count_Example2 
{
	WebDriver driver;
	
	@Test
	public void M4() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		System.out.println("this is tread "+ Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(2000);
	}

	@Test
	public void M5() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println("this is tread "+ Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(2000);
	}

	@Test
	public void M6() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("this is tread "+ Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(2000);
	}

}
