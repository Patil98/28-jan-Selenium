package AllSeleniumPrograme;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invocationTimeOut_TreadPoolSize
{                       //invocationTimeOut=provide in micro sec
    @Test(invocationCount=4,threadPoolSize=2)
	public void Test() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://randomuser.me/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		driver.findElement(By.xpath("//li[@data-label='email']")).click();	
		driver.quit();
	}

}
