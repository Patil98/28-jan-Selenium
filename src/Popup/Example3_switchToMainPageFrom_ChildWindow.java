package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToMainPageFrom_ChildWindow 
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//click on "NewTab" from main page
		driver.findElement(By.xpath("//*[@id=\"regform\"]/div[1]/a/input")).click();

		//get child window ID
		Set<String> allid = driver.getWindowHandles();      //{mainPageID, childWindowID}
		ArrayList<String> a1=new ArrayList<String>(allid);   //{mainPageID(0), childWindowID(1)}

		//switch to child window
		driver.switchTo().window(a1.get(1));            //String childWindowID

		//click on "Training" link from childWindow
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a/span/span")).click();

		Thread.sleep(2000);

		//switch to main page
		driver.switchTo().window(a1.get(0));

		//click on "NewWindow" from main page
		driver.findElement(By.xpath("//*[@id=\"regform\"]/div[2]/a/input")).click();


	}

}
