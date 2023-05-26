package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_isEnabled2 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("(//div[text()='Pay'])[2]")).click();
		
		boolean result = driver.findElement(By.xpath("//button[text()='Proceed']")).isEnabled();
		
		System.out.println(result);
		
	}

}
