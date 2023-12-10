package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDownHandle
{
	@Test
	public void Drop() 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension size = new Dimension(1000, 900);
		driver.manage().window().setSize(size);
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click(driver.findElement(By.xpath("//span[text()='Your Recommendations']"))).perform();

	}

}
