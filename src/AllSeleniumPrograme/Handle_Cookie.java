package AllSeleniumPrograme;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Cookie 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// return the list of all cookies
		Set<Cookie> allcookies = driver.manage().getCookies();

		// size of the cookie
		System.out.println("Before adding size:" + allcookies.size());

		for (Cookie ck : allcookies)
		{  
			System.out.println(ck.getName() + ":" + ck.getValue());
		}

		// get specific cookie according to name
		System.out.println(driver.manage().getCookieNamed("i18n-prefs"));

		// create cookies
		Cookie co = new Cookie("bhushan", "test123");

		// add cookies
		driver.manage().addCookie(co);

		// return the list of all cookies
		allcookies = driver.manage().getCookies();

		// size of the cookie
		System.out.println("\nafter adding size:" + allcookies.size());

		for (Cookie ck:allcookies) 
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}

		// delete cookies
		//driver.manage().deleteCookie(co);
        //driver.manage().deleteCookieNamed("bhushan");
        driver.manage().deleteAllCookies();
		
		// return the list of all cookies
		allcookies = driver.manage().getCookies();

		// size of the cookie
		System.out.println("\nafter delete size:" + allcookies.size());

		for (Cookie ck : allcookies) 
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}
		
		
		driver.close();

	}

}
