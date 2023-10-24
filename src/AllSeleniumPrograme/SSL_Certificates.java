package AllSeleniumPrograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSL_Certificates 
{
	@Test
	public void SSL() 
	{
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://expired.badssl.com/");
	}

}
