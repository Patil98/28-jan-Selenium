package HandlingOfAutoSugetions_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("redmi");

     List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

     String Expect="redmi 12";
     for(WebElement all:options)
     {
    	 String text = all.getText();
    	 if(Expect.equals(text))
    	 {
    		 all.click();
    		 break;
    	 }
    	 
     }

	}

}
