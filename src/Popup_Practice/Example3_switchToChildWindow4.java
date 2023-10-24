package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example3_switchToChildWindow4 
{
	@Test
	public void window()
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("realme 11 pro +");
   
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        //String main = driver.getWindowHandle();
        
        driver.findElement(By.xpath("(//div[contains(text(),'realme 11 Pro 5G' )])[1]")).click();
        
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> ar = new ArrayList<>(windowHandles);
        
        driver.switchTo().window(ar.get(1));
        
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

        driver.switchTo().window(ar.get(0));
        
        driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]")).click();
     
        
	}

}
