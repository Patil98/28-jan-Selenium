package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test1 
{


	@Test(dataProvider="create")
	public void test(String username,String password) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.close();

		Thread.sleep(3000);
	}



	@DataProvider(name="create")
	public Object[][] datatest() 
	{

		return new Object[][] 
				{     //"username" ,"password"
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}

				};

	}



}



