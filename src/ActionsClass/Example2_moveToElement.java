package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_moveToElement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		Thread.sleep(2000);
		
		WebElement langauge = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/div"));
		
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		act.moveToElement(langauge).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[2]/span/span[1]")).click();
		
		
		
		
		
	}

}
