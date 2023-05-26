package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_getAttribute
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhushan");
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		
		System.out.println(text);
	}
	
}
