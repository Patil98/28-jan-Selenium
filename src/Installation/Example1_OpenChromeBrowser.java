package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example1_OpenChromeBrowser

{

	
	public static void main(String[] args) 
	{  
		//path setup of specific browser
		//System.setProperty("webdriver.chrome.driver", "path of chromedriver.exe");                    //classname.methodname();
		//classname.methodname();
		
	       WebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.navigate().to("https://www.instagram.com");
	    driver.navigate().back();
	    
	    
	  //  WebDriver driver1= new EdgeDriver();
	   //driver1.get("https://www.facebook.com");
	    
		
	}
}
