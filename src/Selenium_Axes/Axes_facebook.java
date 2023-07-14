package Selenium_Axes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Axes_facebook
{
	
 @Test
 public void Example() 
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
 	//driver.findElement(By.className("_97w5")).click();
 	
 	
 	// self Axes --> enter pass
 	//driver.findElement(By.xpath("//input[@id='password_step_input']/self::input")).sendKeys("patil@123");
	 
    // self Axes --> enter email
 	driver.findElement(By.xpath("//input[@id='email']/self::input")).sendKeys("bhushan@gmail.com");
 	
 	//enter pass  following-sibling
 	 driver.findElement(By.xpath("//input[@id='email']/parent::div/following-sibling::div/descendant::input")).sendKeys("patil@123");
 	 			
 	//following Axes--> select radio button -->> male
 	//driver.findElement(By.xpath("//input[@id='password_step_input']/following::input[4]")).click();
 	
 	//enter pass  following-sibling
 	//driver.findElement(By.xpath("//input[@id='email']/parent::div/following-sibling::div/descendant::input")).sendKeys("patil@123");
 					
 	
 	// following-sibling-->> 
 	driver.findElement(By.xpath("//input[@id='email']/parent::div/following-sibling::div/descendant::input")).click();
 	
 	driver.close();
}	
	

}
