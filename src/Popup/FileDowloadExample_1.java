package Popup;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDowloadExample_1 
{
	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "C:\\Users\\bvp13\\OneDrive\\Pictures");
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bpsc.bih.nic.in/");
		
		driver.findElement(By.xpath("(//a[@class='wbg'])[1]")).click();
		
	}

}
