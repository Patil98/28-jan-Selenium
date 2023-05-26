package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13_Click2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("shirt");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/span/a/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		
	}

}
