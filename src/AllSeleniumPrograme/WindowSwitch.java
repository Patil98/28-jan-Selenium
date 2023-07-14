package AllSeleniumPrograme;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		String ParentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-google'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-youtube'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-facebook'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-rss'])[1]")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> allID = new ArrayList<String>(handles);

		if(SwitchToRightWindow("Facebook", allID))
		{
			System.out.println(driver.getCurrentUrl() + " |  " + driver.getTitle());
		}

		SwitchToParentWindow(ParentWindow);
		System.out.println(driver.getCurrentUrl() + " |  " + driver.getTitle());

		CloseAllWindow(allID, ParentWindow);

	}

	public static void CloseAllWindow(List<String> allID, String ParentWindow) 
	{
		for (String e : allID) 
		{
			if (!e.equals(ParentWindow)) 
			{
				driver.switchTo().window(e).close();
			}
		}
	}

	public static void SwitchToParentWindow(String ParentWindow) 
	{
		driver.switchTo().window(ParentWindow);
	}

	public static boolean SwitchToRightWindow(String windowtitle, List<String> allID) 
	{
		for (String e : allID) 
		{
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowtitle)) 
			{
				System.out.println("find right window....");
				return true;
			}
		}
		return false;
	}

}
