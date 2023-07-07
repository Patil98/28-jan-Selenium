package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_DragAndDrop3 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.xpath("//a[text()=' BANK ']")), driver.findElement(By.xpath("//li[@class='placeholder']"))).perform();
		
		
	}

}
