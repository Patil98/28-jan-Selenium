package Popup;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDowloadExample_3 
{
	public static void main(String[] args)
	{
	
		FirefoxOptions options=new FirefoxOptions();
	
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);  //download the file
	    profile.setPreference("browser.download.dir", "C:\\Users\\bvp13\\OneDrive\\Pictures");
	    profile.setPreference("browser.download.folderList", 2);
		options.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bpsc.bih.nic.in/");
		
		driver.findElement(By.xpath("(//a[@class='wbg'])[1]")).click();
		
	}

}
