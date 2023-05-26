package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_selectMultipleCheckboxes
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sbimf.com/mutual-fund/equity-mutual-funds");
		
		Thread.sleep(10000);
		
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(check.size());
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		check.get(9).click();				
	}
	
}
