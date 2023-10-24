package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 
{
public static void main(String[] args) 
{

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("document.getElementsByName('language')[1].click()");
	//js.executeScript("document.getElementsByClassName('bcCheckBox')[2].click()");
	js.executeScript("document.getElementsByClassName('bcTextBox')[2].value='patil@123'");
	
	
}
}
