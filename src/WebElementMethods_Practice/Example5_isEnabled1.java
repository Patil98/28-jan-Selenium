package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_isEnabled1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		boolean is = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).isEnabled();
		System.out.println(is);

		
		if(is)
		{
			System.out.println("is enabled");
		}
		else
		{
			System.out.println("is disabled");
		}
		
}
}