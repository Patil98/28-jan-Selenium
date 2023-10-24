package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example3 
{
	@Test
	public void frame() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		/*int size = driver.findElements(By.tagName("iframe")).size();
		
		for(int i=0; i<size; i++)
		{
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}*/
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("html/body/a/img")).click();	
	}

}
