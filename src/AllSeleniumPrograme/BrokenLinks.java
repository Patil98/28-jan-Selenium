package AllSeleniumPrograme;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks
{
	@Test
	public void brokenlinks() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("total links on page->> "+ele.size());


		int brokenlinkscnt=0;

		for(WebElement alllinks:ele)
		{
			String url = alllinks.getAttribute("href");

			try 
			{
				URL urllink = new URL(url);

				HttpURLConnection huc= (HttpURLConnection) urllink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				int responsecode = huc.getResponseCode();

				if(responsecode>=400)
				{
					System.out.println(url +" ->>broken link");
					brokenlinkscnt++;
				}

			}
			catch (MalformedURLException e) 
			{
				e.printStackTrace();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}

		}
		// total broken links
		System.out.println("total broken links ->> "+ brokenlinkscnt);

		driver.quit();  

	}
}
