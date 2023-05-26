package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13_Click4 
{
	
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#container > div > div._331-kn._2tvxW > div > div > div:nth-child(2) > a > div._1mkliO > div > img")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[1]/a[4]")).click();
		
		
		
		
	}

}
