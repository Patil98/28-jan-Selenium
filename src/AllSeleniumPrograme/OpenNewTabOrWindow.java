package AllSeleniumPrograme;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.amazon.in/");
		System.out.println("first tab: " + driver.getCurrentUrl());

		// open new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		System.out.println("second tab: " + driver.getCurrentUrl());

		// open new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.redbus.in/");
		System.out.println("third tab: " + driver.getCurrentUrl());

		// get window handles of open window
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowhandle);
		
		Thread.sleep(2000);

		// switch to second tab
		driver.switchTo().window(handles.get(1));
		System.out.println("second tab: " + driver.getCurrentUrl());

		Thread.sleep(2000);

		// switch to first tab
		driver.switchTo().window(handles.get(0));
		System.out.println("first tab: " + driver.getCurrentUrl());

		driver.quit();
		driver.close();
		
		
		
	}
}