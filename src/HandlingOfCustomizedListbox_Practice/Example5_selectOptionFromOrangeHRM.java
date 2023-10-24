package HandlingOfCustomizedListbox_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_selectOptionFromOrangeHRM 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='PIM'])[1]")).click();

		Thread.sleep(2000);

	    driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[2]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[normalize-space()='Database Administrator'])[1]")).click();
				

//		Actions action = new Actions(driver);
//
//		action.click(element).perform();
//
//		//Thread.sleep(2000);
//		
//		action.click(driver.findElement(By.xpath("(//span[normalize-space()='Database Administrator'])[1]"))).perform();

//		for(int i=1; i<=6; i++)
//		{
//			action.sendKeys(Keys.ARROW_DOWN).perform();
//			Thread.sleep(2000);
//		}
//
//		action.sendKeys(Keys.ENTER).perform();




	}
}
