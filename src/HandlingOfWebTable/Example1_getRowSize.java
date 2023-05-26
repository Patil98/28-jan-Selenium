package HandlingOfWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/example5.html");
	
	
	 int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
	System.out.println(rowsize);
	
	
	
}
	
}
