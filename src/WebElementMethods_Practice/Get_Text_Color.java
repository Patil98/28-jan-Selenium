package WebElementMethods_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Text_Color
{
	
public static void main(String[] args) throws InterruptedException 
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/?ir=1");
	
	Thread.sleep(2000);
	
	String getTextcolor = driver.findElement(By.xpath("//img[@alt='Mahindra logo']")).getCssValue("font-size");
	System.out.println(getTextcolor);
	
}
}