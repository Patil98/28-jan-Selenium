package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).click(driver.findElement(By.xpath("//span[text()='Your Orders']"))).perform();
		Thread.sleep(2000);
		driver.close();
	}
	

}
