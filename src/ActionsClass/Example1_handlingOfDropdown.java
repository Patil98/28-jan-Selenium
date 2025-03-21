package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		WebElement list = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));

		Thread.sleep(2000);

		Actions act=new Actions(driver);

		act.moveToElement(list).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();
		
	}

}
