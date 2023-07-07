package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_mouseRightClick3 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().perform();
		
		
	}

}
