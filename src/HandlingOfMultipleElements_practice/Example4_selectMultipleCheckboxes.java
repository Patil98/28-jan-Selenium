package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_selectMultipleCheckboxes
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");

		driver.switchTo().frame("iframeResult");
		
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(check.size());
		
		for(WebElement s1:check)
		{
			s1.click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/a[5]")).click();
		
	}

}
