package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_mouseLeftClick1 
{
      public static void main(String[] args) throws InterruptedException 
      {
    	  WebDriver driver=new ChromeDriver();
    	  driver.get("https://www.flipkart.com/");
    	  
    	  Thread.sleep(1000);
    	  
    	  driver.manage().window().maximize();
    	  
    	  driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    	  Thread.sleep(1000);
    	 WebElement lclick = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img"));
   	  Thread.sleep(1000);
    	 Actions act=new Actions(driver);
   	  Thread.sleep(1000);
    	 act.click(lclick).perform();
    	 
    	 
    	 
    	 
    	 
	}

}
