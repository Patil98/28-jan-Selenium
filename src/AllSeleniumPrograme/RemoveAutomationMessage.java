package AllSeleniumPrograme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveAutomationMessage
{
	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		//option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"} );
		  option.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		//option.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		//option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		/*List<String> data=new ArrayList<>();
		data.add("enable-automation");
		option.setExperimentalOption("excludeSwitches", data);*/
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	

}
