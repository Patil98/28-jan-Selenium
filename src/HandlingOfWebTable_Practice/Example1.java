package HandlingOfWebTable_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 
{
	@Test
	public void techlist() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
		driver.manage().window().maximize();
		
		System.out.println("**************************");
		
		//get specific data
		String text = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[5]")).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[3]")).getText();
		System.out.println(text1);
		
		System.out.println("**************************");
		
		//get size of all row and data
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		System.out.println(ele.size());
		
		for(WebElement all:ele)
		{
			System.out.println(all.getText());
		}
		
		System.out.println("**************************");
		
		//get size of all column in a table header row
		List<WebElement> el = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		System.out.println(el.size());
		
		for(WebElement all:el)
		{
			System.out.println(all.getText());
		}
		
		
		driver.close();
	}

}
