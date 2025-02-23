package ActionsClass_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPasteUsingSeleninum1 
{

	public static void main(String[] args) throws InterruptedException 
	{   

		WebDriver driver = new ChromeDriver();
		driver.get("https://kodingwindow.com/testapp/");
		driver.findElement(By.name("username")).sendKeys("kodingwindow");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL, "a");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"c");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL, "x");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL, "v");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		
	
		driver.close();

	}

}
