package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example7_SendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		act.sendKeys(send, "one plus 11").perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		//driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

}
