package HandlingOfAutoSugetions_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BigBasket
{
	@Test
	public void get() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();

		WebElement ele = driver.findElement(By.xpath("(//li[@class='jsx-1259984711'])[28]"));
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();     //(//a[text()='Beverages'])[2]

		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='jsx-1259984711']"));

		for(WebElement all:elements)
		{
			System.out.println(all.getText());
		}
	}

}
