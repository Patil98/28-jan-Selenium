package ChromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arguments4_DisableExtensions
{
	public static void main(String[] args)
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("disable-extensions");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
