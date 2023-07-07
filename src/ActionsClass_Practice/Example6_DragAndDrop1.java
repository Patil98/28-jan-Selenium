package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_DragAndDrop1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		
		
	}

}
