package HandlingOfWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getData 
{
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/example5.html");
	
	Thread.sleep(1000);
	
	String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
	System.out.println(text);
	
	//header
	String tex = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
	System.out.println(tex);
	
	
}
}
