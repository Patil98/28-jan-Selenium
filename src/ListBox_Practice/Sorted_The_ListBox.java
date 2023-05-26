package ListBox_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorted_The_ListBox
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(2000);
	
	Select s=new Select(month);
	
	List sor=new ArrayList();
	
	List<WebElement> get = s.getOptions();
	
	for(WebElement w:get)
	{
		sor.add(w.getText());
		//System.out.println( w.getText());
	}
	//System.out.println("...............");
	//System.out.println("after sorting");
	//System.out.println(sor);
      
	System.out.println("before sorting :"+ sor);
	
	Collections.sort(sor);
	
	System.out.println("after sorting :"+ sor);
	
		
	}

}
