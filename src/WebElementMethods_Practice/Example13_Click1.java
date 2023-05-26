package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13_Click1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 Thread.sleep(2000);
		 
		WebElement b = driver.findElement(By.id("twotabsearchtextbox"));
		// b.sendKeys("asian shoes");
		 Thread.sleep(2000);
		 
		// b.clear();
		 
		 Thread.sleep(2000);
		 
		 b.sendKeys("Asian shoes foe men");
		 
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 
		 driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 
		 
		 Thread.sleep(2000);
		 
//		 driver.findElement(By.id("nav-search-submit-button")).click();
//		 
//		 String s = driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).getText();
//		 System.out.println(s);
//		 
//		 String s1 = driver.findElement(By.id("nav-logo-sprites")).getText();
//		 System.out.println(s1);
//		 
//		 driver.get("https://www.espncricinfo.com/");
//		 
//		 driver.findElement(By.xpath("//div[@title='UAE']")).click();
//	}

}
}
