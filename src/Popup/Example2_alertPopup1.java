package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_alertPopup1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("111");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();		
		
		//1: getText from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
//		//2: click on cancel btn from alert popup
//		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		//3: click on "OK" btn from 1st alert popup
		driver.switchTo().alert().accept();
  
		Thread.sleep(3000);
		
		//4: click on "OK" btn from 2nd alert popup
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
