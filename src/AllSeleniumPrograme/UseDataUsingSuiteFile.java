package AllSeleniumPrograme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UseDataUsingSuiteFile 
{
    @Parameters({"url","username","password"})
	@Test
	public void data(String url,String username,String password) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		driver.findElement(By.id("userEmail")).sendKeys(username);
		
		driver.findElement(By.id("userPassword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
		
	}
	
}
