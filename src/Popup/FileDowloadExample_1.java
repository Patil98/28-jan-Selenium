package Popup;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDowloadExample_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "C:\\Users\\bvp13\\OneDrive\\Pictures");
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://bpsc.bihar.gov.in/");
		driver.findElement(By.xpath("//a[contains(text(),'One Disabled (MD) Candidate included in Provisiona')]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
