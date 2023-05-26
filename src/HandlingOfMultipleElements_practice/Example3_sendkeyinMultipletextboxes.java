package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_sendkeyinMultipletextboxes
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> alltextbox = driver.findElements(By.xpath("//input[@type='text']")); 
		
		System.out.println(alltextbox.size());
		alltextbox.get(1).sendKeys("bhushan");
		
		Thread.sleep(2000);
		alltextbox.get(2).sendKeys("patil");
		
		Thread.sleep(2000);
		alltextbox.get(3).sendKeys("6045112258");
		
		
	
	}


}
