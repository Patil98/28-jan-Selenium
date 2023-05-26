package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_getAttribute 
{


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	WebElement send = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	send.sendKeys("bhushan@gmail.com");
	
	String value = send.getAttribute("value");
	System.out.println(value);
}
}