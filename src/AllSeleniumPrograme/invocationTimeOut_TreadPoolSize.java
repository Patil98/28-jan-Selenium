package AllSeleniumPrograme;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class invocationTimeOut_TreadPoolSize
{                       //invocationTimeOut=provide in micro sec
    @Test(invocationCount=4,threadPoolSize=3)
	public void Test() throws InterruptedException 
	{
    	ChromeOptions cp = new ChromeOptions();
    	cp.addArguments("--disable-infobars");
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://randomuser.me/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		driver.findElement(By.xpath("//li[@data-label='email']")).click();	
		driver.quit();
	}

}
