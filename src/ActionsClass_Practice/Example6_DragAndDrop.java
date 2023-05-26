package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_DragAndDrop 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src, dest).perform();
		
	}

}
