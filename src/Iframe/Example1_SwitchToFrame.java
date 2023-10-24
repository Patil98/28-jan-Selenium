package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToFrame 
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		Thread.sleep(2000);
		//switch to frame
		driver.switchTo().frame(1);                         //intframeIndex
		//driver.switchTo().frame("iframeResult");            //String FrameName
		//driver.switchTo().frame("iframeResult");            //String frameID

		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));                   //frame webElement

		//click on "click me btn"
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
