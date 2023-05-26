package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_getAttribute2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhushan");
		
    String text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		
		System.out.println(text);
		
		
	}

}
