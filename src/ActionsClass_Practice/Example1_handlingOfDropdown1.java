package ActionsClass_Practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		WebElement list = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[1]/div/img"));

		Actions act=new Actions(driver);

		Thread.sleep(2000);
		act.moveToElement(list).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Wired Headphones']")).click();


	}

}
