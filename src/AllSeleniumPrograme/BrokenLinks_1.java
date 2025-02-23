package AllSeleniumPrograme;

import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.URL;
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
			//Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(address, port));
			HttpURLConnection open =(HttpURLConnection)links.openConnection();
			open.setRequestMethod("HEAD");               //proxy-> pass this to openConnection
			open.connect();

			if(open.getResponseCode()>=400)
			{
				System.out.println(open.getResponseCode()+" "+url+" is Broken Links");
				BrokenLinks++;
			}
			else
			{
				System.out.println(open.getResponseCode()+" "+url+" is valid Links");
			}  
			
			open.disconnect();
		}
		
		System.out.println("number of Broken Links "+BrokenLinks);
		Thread.sleep(2000);
		driver.quit();
	}

}
