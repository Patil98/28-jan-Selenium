package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
     	
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(drop).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Remote Control']")).click();
		
		
	}

}
