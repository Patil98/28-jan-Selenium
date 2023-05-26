package Popup_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_alertPopup3
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		// click on "try it" button
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Thread.sleep(2000);
		
		//switch to alert
		driver.switchTo().alert();
		
		// get text 
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//click on "ok"  button
		driver.switchTo().alert().accept();
		
	}
	

}
