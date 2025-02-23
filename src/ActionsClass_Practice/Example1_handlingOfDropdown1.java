package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		
		WebElement list = driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions act=new Actions(driver);

		Thread.sleep(2000);
		act.moveToElement(list).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Wired Headphones']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
