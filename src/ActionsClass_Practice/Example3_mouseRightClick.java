package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_mouseRightClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		WebElement td = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));

		Actions act=new Actions(driver);

		Thread.sleep(2000);

		//act.moveToElement(td).perform();
		//act.contextClick().perform();

		//act.moveToElement(td).contextClick().perform();

		act.contextClick(td).perform();


	}

}
