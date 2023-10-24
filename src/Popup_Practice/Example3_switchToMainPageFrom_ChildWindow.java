package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToMainPageFrom_ChildWindow 
{

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//click on "click here"  button
		driver.findElement(By.xpath("/html/body/p/a")).click();


		String main = driver.getWindowHandle();

		// get child window id
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(allid);


		//switch to child window
		driver.switchTo().window(a1.get(1));

		//Enter email id and click on submit button
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("bhushan@gmail.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();


		//switch to main window
		driver.switchTo().window(main);

		// driver.close();

	}

}
