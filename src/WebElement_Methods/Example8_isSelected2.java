package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_isSelected2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement selectmale = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		selectmale.click();
		
		boolean result = selectmale.isSelected();
		System.out.println(result);

		if(result)
		{
			System.out.println("radio btn is selected");
		}
		else
		{
			System.out.println("radio btn is not selected");
		}
		
	}

}
