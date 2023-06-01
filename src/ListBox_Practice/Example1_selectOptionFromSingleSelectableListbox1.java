package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_selectOptionFromSingleSelectableListbox1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(day);
		Thread.sleep(2000);
		Select s1=new Select(month);
		Thread.sleep(2000);
		Select s2=new Select(year);
		
		Thread.sleep(2000);
		
		s2.selectByValue("1998");
		Thread.sleep(2000);
		
		
		
         s.selectByIndex(21);
         //s.selectByValue("22");
         
         Thread.sleep(2000);  
         s1.selectByVisibleText("Mar");
		

	}
}
