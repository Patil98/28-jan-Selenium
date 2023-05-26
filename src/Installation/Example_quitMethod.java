package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_quitMethod 

{
	public static void main(String[] args) {
		

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.quit();	
	
	
	}
}
