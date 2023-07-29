package AllSeleniumPrograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tread_Count_Example1 
{    
	WebDriver driver;

	@Test
	public void M1() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("this is tread "+ Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(2000);

	}

	@Test
	public void M2() throws InterruptedException 
	{

		driver=new ChromeDriver();
		driver.get("https://www.Google.com/");
		System.out.println("this is tread "+ Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(2000);

	}

	@Test
	public void M3() throws InterruptedException 
	{

		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("this is tread "+ Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(2000);
	}

	




}
