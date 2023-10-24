package ChromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arguments7_version
{
	public static void main(String[] args)
	{

		ChromeOptions option = new ChromeOptions();
		option.addArguments("version");
		System.out.println(option);
		WebDriver driver = new ChromeDriver(option);
		System.out.println(option);
		driver.get("https://www.redbus.in/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
