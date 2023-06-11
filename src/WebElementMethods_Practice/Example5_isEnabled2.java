package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_isEnabled2 
{
	
public static void main(String[] args) throws InterruptedException
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	boolean check = driver.findElement(By.xpath("//font[text()='Games']")).isEnabled();
	System.out.println(check);
	
	
	
	
	
	
	
}

}
