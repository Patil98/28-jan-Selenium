package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_selectOptionFromSingleSelectableListbox
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	     Thread.sleep(2000);
	     
	    WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
	    Select s=new Select(day);
	    s.selectByIndex(21);
	    
	    
	    WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	    Select s1=new Select(month);
	    s1.selectByValue("3");
	    
	    
	    WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
	    Select s2=new Select(year);
	    s2.selectByValue("1998");
	    
	}
	
}
