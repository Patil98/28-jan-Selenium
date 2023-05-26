package ListBox_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_getAllOptionFromListBox 
{
	
	public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			Thread.sleep(2000);
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			Select s=new Select(month);
			
			List<WebElement> get = s.getOptions();
			
			for(WebElement v:get)
			{
				System.out.println(v.getText());
			}
			
	}

}
