package AllSeleniumPrograme;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie all:cookies)
		{
			System.out.println(all.getDomain());
			System.out.println(all.getName());
			System.out.println(all.getPath());
			System.out.println(all.getSameSite());
			System.out.println(all.getValue());
			System.out.println(all.getClass());
			System.out.println(all.getExpiry());
		}
		
		
		
		
		
		
		
	}

}
