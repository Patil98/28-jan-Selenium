package DataProvider_TestNG;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_Test5 
{
	@Test(dataProvider="dataset")
	public void TestCaseGoogleSearch(String state,String monuments) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		//co.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		co.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//enter key combination
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(state+" "+monuments);
		
		//click on search btn
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		Thread.sleep(2000);
		
		//close borwser
		driver.close();
	}
	
	
	@DataProvider(name="dataset" ,parallel=true , indices={0,1})
	public Object[][] DataProvider() 
	{
		return new Object[][]
			{
					{"Delhi","qutubminar"},
					{"agra","tajmahal"},
					{"hyderabad","charminar"},
					{"hyderabad","charminar"},
					{"jalgaon","chopda"},
					{"jammu","kashmir"},
			};
	}

}
