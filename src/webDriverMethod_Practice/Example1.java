package webDriverMethod_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{	
		

		public static void main(String[] args) throws InterruptedException
		
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().minimize();
			
			//driver.close();
			
			//driver.quit();
//			
//			String title = driver.getTitle();
//			
//			System.out.println(title);
//			
//	
//			String titl = driver.getCurrentUrl();
//			
//			System.out.println(titl);
			
			
//			
//			driver.manage().window().maximize();
//			
//			Thread.sleep(2000);
//			
////			driver.manage().window().minimize();
//			
//			driver.navigate().to("https://www.google.com/");
//			
//			Thread.sleep(2000);
//			
//			driver.navigate().to("https://www.facebook.com");
//			
//			Thread.sleep(2000);
//			
//			driver.navigate().back();
//			
//			Thread.sleep(2000);
//			
//			driver.navigate().forward();
//			
//			Thread.sleep(2000);
//			
//			driver.navigate().refresh();
//			
			
			
		}
	}
		


