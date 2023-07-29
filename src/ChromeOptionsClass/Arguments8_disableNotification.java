package ChromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arguments8_disableNotification
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
	
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
