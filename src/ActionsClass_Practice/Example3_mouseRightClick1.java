package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_mouseRightClick1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		
		act.contextClick(rclick).perform();
		
		
		
	}

}
