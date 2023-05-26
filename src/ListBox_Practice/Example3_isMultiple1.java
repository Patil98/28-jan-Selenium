package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_isMultiple1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		

     WebDriver driver=new ChromeDriver();
 
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
     Thread.sleep(2000);
     WebElement a = driver.findElement(By.xpath("//*[@id=\"day\"]"));
   
     Select s=new Select(a);
     
     boolean check = s.isMultiple();
     
     if(check)
     {
    	 System.out.println("is mutiple");
     }
     else
     {
    	 System.out.println("is not");
     }
	
}

	
}