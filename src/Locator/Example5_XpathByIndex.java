package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_XpathByIndex 
{
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	//click on create new acct
	driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
	
	Thread.sleep(3000);
	
	
	//enter Fname
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bhushan");
	
	Thread.sleep(3000);
	
	
	//enter Lname
	driver.findElement(By.xpath("(//input[@type ='text'])[3]")).sendKeys("patil");

	
	
    Thread.sleep(3000);
    
	//enter mo num
	driver.findElement(By.xpath("(//input[@type ='text'])[4]")).sendKeys("9075111787");
	

    Thread.sleep(3000);
    
	//enter PWD
	driver.findElement(By.xpath("(//input[@type ='password'])[2]")).sendKeys("patil@123");
	
	
	
}	
	
	
}
