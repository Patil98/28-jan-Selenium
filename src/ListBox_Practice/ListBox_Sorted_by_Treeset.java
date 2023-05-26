package ListBox_Practice;

import java.util.List;
import java.util.TreeSet;

import javax.swing.text.TabSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Sorted_by_Treeset 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		Select s=new Select(month);
		
		TreeSet t=new TreeSet();
		
		List<WebElement> all = s.getOptions();
		
		for(WebElement d:all)
		{
		     t.add(d.getText());
			System.out.println(d.getText()+" ");
		
		}
	
		System.out.println(t);
		
		
		
		
		
		
		
		
	}

}
