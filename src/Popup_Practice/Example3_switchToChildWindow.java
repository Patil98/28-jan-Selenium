package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.findElement(By.xpath("//img[@alt='Sandals & Floaters']")).click();
		
		driver.findElement(By.xpath("//div[@class='_312yBx SFzpgZ']")).click();
		
		
		//get child window id
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(allid);
		
		
		//switch to child window
		driver.switchTo().window(a1.get(1));
		
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("swatch-4-size")).click();
		
		
	   Thread.sleep(2000);
	   
		//click on "add to cart"
         driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
         
         Thread.sleep(2000);
         
     /*  //switch to main window
         driver.switchTo().window(a1.get(0));
         
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//a[@title='Men Brown Casual Sandal']")).click();  */
		
         
         driver.findElement(By.xpath("//div[@class='_21YjFX _1ylYJu']")).click();
         
         driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/button")).click();
	}

}
