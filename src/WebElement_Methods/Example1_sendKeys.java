package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_sendKeys 

{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhushan");
		
		
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		
		UN.sendKeys("bhushan");
		
		String text = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		
		System.out.println(text);
		
	}
	
	
}
