package Popup;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDowloadExample_3 
{
	public static void main(String[] args) throws InterruptedException
	{

		FirefoxOptions options=new FirefoxOptions();

		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);  //download the file
		profile.setPreference("browser.download.dir", "C:\\Users\\bvp13\\OneDrive\\Pictures");
		profile.setPreference("browser.download.folderList", 2);
		options.setProfile(profile);

		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://bpsc.bihar.gov.in/");

		driver.findElement(By.xpath("//a[contains(text(),'Assistant Prosecution Officer')]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
