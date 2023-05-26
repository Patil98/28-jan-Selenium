package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToMainPageFrom_ChildWindow1 
{
	
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(allid);
		
		
		driver.switchTo().window(a1.get(1));
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("bhushan@gmail.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		
		
		
		
		
//		driver.switchTo().window(a1.get(0));
		
		
		
		
	}

}
