package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_mouseLeftClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		Thread.sleep(2000);
		
		//WebElement cart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span"));

		Actions act=new Actions(driver);
		
	//	act.moveToElement(cart).perform();
	//	act.click().perform();
		
	//	act.moveToElement(cart).click().perform();      ---without parameter click method
		
		//act.click(cart).perform();                      ---with parameter click method
		
		act.click(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span"))).perform();	
		
		
	}

}
