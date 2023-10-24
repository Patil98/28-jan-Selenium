package HandlingOfAutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("redmi");

		Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String expText="redmi note 13 pro";
		
		for(WebElement s1:alloptions)
		{
		    String actText = s1.getText();
		    if(actText.equals(expText))
		    {
		    	s1.click();
		    	break;
		    }
		}
		
	}

}
