package ChromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arguments5_DisablePopUpBlocking 
{
	public static void main(String[] args)
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("disable-popup-blocking");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.naukari.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
