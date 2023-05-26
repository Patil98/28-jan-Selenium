package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_mouseDoubleClick 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
	//	act.moveToElement(doubleclick).perform();
	//	act.doubleClick().perform();
		
	//	act.moveToElement(doubleclick).doubleClick().perform();
		
		act.doubleClick(doubleclick).perform();
		
		
	}

}
