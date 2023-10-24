package AllSeleniumPrograme;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterateAWindow
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


		// open new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://books-pwakit.appspot.com/");
		System.out.println("third tab: " + driver.getCurrentUrl());


		// open new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://shop.polymer-project.org/");
		System.out.println("third tab: " + driver.getCurrentUrl());


		// open new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://quillbot.com/");
		System.out.println("third tab: " + driver.getCurrentUrl());

		// open new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/");
		System.out.println("third tab: " + driver.getCurrentUrl());

		// get window handles of open window
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowhandle);
		
     
		for(int i=0; i<handles.size(); i++)
		{
			driver.switchTo().window(handles.get(i));
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
