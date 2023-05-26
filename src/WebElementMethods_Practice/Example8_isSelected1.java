package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_isSelected1 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[3]/div/div/div/div[1]")).click();
		
		Thread.sleep(2000);
	WebElement tru = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[1]/div/div/div[2]/div[1]/div[2]/label"));
	tru.click();
				
		Thread.sleep(2000);
		boolean select = tru.isSelected();
		System.out.println(select);
		
		
	}

}
