package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example3_PrintTime 
{
	@Test
	public void getTime() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.timeanddate.com/worldclock/india/new-delhi");
		String time = driver.findElement(By.xpath("//div[@id='qlook']/child::div/span[1]")).getText();
		System.out.println(time);                  //->//div[@id='qlook']/descendant::span[3]
		
		driver.close();
	}

}
