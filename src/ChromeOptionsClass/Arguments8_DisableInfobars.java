package ChromeOptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arguments8_DisableInfobars
{
	public static void main(String[] args)
	{
		//--disable-infobars is currently deprecated 
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-infobars");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		//we can pass this options also
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
//		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
//		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(options); 

		driver.get("https://www.redbus.in/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
