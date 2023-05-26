package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_isEnabled2 
{
	
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		boolean result = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
		
		System.out.println(result);
		
		if(result)
		{
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is disabled");
		}
		
	}

}
