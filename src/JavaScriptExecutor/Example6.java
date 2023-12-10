package JavaScriptExecutor;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example6 {

	public static void main(String[] args) 
	{
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        co.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
   
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('inputtext _55r1 _6luy')[0].value='bhushan@gmail.com'");
		js.executeScript("document.getElementsByClassName('inputtext _55r1 _6luy')[1].value='patil@123'");
     	
	}

}
