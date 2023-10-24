package AllSeleniumPrograme;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisablePopupBlocking 
{
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");


	}
}
