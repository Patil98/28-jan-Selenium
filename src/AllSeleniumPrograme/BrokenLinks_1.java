package AllSeleniumPrograme;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_1 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		int BrokenLinks=0;

		List<WebElement> link = driver.findElements(By.tagName("a"));

		for(WebElement all:link)
		{
			String url = all.getAttribute("href");

			if(url==null || url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}

			URL links = new URL(url);
			HttpURLConnection open =(HttpURLConnection)links.openConnection();
			open.connect();

			if(open.getResponseCode()>=200)
			{
				System.out.println(open.getResponseCode() +url +" is Broken Links");
				BrokenLinks++;
			}
			else
			{
				System.out.println(open.getResponseCode() +url+"is  valid   Links");
			}  
		}
		
		System.out.println("number of Broken Links "+BrokenLinks);
		Thread.sleep(2000);
		driver.quit();
	}

}
