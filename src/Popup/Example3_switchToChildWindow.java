package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow
{
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on "NewTab" from main page
		driver.findElement(By.xpath("//*[@id=\"regform\"]/div[1]/a/input")).click();
		
		//get child window ID
		Set<String> allid = driver.getWindowHandles();           //{mainPageID, childWindowID}
        ArrayList<String> a1=new ArrayList<String>(allid);       //{mainPageID(0), childWindowID(1)}
		String childwindowid = a1.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindowid);     //String childWindowID
		
		//click on "Training" link from childWindow
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a")).click();

		driver.quit();
		
	}

}
