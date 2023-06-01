package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_WithoutDDF 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// click on sign in button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//enter mob num
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9075111787");
		
		//click on signIn with pwd btn
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		Thread.sleep(2000);
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("bhushan98");
		
		//click on signIn btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		//open my account dropdown options
		WebElement myAccount = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAccount).perform();
		
		//click on my profile btn
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Thread.sleep(2000);
		
		//switch to child window
		Set<String> get = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(get);
		driver.switchTo().window(a.get(1));
		Thread.sleep(2000);
		
		//get full name
		String acttext = driver.findElement(By.xpath("//input[@id='outlined-secondary']")).getAttribute("value");
		
		String exptext="bhushan patil";
		
		if(acttext.equals(exptext))
		{
			System.out.println("TC IS PASS");
		}
		else
		{
			System.out.println("TC IS FAIL");
		}
		Thread.sleep(2000);
		
		driver.quit();
		
		}
		
		
	}



