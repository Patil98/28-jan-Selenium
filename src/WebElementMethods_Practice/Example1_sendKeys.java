package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example1_sendKeys
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement s = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		s.sendKeys("shirt");
		Thread.sleep(2000);
		s.clear();
		Thread.sleep(2000);

		s.sendKeys("t-shirt");
		Thread.sleep(2000);
		s.clear();
		Thread.sleep(2000);
		s.sendKeys("one plus 11 pro");
		Thread.sleep(2000);
		s.clear();
		Thread.sleep(2000);
	}		







}
