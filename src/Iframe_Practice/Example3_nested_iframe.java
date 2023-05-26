package Iframe_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_nested_iframe 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		//outer frame
		driver.switchTo().frame("iframeResult");
		
		String text = driver.findElement(By.tagName("p")).getText();
         System.out.println(text);
         
         //nested frame
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		Thread.sleep(2000);
         
         String te = driver.findElement(By.tagName("h1")).getText();
         System.out.println(te);
         
         //jump from nested frame to outer frame
         driver.switchTo().parentFrame();
         
    	Thread.sleep(2000);
    	
        String t = driver.findElement(By.tagName("p")).getText();
        System.out.println(t);
        
         //jump from outer frame to main page
         driver.switchTo().parentFrame();
        
     	Thread.sleep(2000);
       
       driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();         
        
        
         
	}

}
