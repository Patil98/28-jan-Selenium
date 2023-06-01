package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_mouseLeftClick 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement lclick = driver.findElement(By.xpath("//img[@alt='Refrigerators']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.click(lclick).perform();
		
		
		
		
		
		
		
		
	}

}
