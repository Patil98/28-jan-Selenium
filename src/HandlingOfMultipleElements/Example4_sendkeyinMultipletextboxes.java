package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_sendkeyinMultipletextboxes
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/Handling%20of%20Multiple%20Elements.html");
		
		
		List<WebElement> alltextbox = driver.findElements(By.xpath("//input[@type='text']")); 
		
		System.out.println(alltextbox.size());
		alltextbox.get(0).sendKeys("bhushan");
		Thread.sleep(5000);
		alltextbox.get(1).sendKeys("patil");
		
		
		
		
	}

}
