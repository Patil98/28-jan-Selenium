package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_getReviewsFromMeeshoApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shirt");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("(//img[@alt='Vellical Men Shirts'])[1]")).click();
		Thread.sleep(2000);
		
		//get review and rating
		String text = driver.findElement(By.xpath("(//div[contains(@class,'sc-bcXHqe Pagestyled')]//span)[8]")).getText();
		System.out.println(text);
		
	}

}
