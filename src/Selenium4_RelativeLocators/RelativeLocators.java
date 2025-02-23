package Selenium4_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocators 
{
	@Test
	public void below_relatives() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");


		//below
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email"))).sendKeys("Patil@123");

		//Above
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("bhushan@patil");

		//Near 
		driver.findElement(RelativeLocator.with(By.tagName("button")).near(By.id("pass"), 50)).click();

		//To Left of
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.xpath("//input[@name='firstname']")).toLeftOf(By.name("lastname"))).sendKeys("bhushan");

		//To Rigth Of
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.name("firstname"))).sendKeys("patil");

	}
}
