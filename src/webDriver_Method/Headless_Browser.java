package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless_Browser 
{
	
	public static void main(String[] args) 
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		//--headless=chrome
		//--headless=new
		
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
