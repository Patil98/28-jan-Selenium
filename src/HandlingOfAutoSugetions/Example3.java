package HandlingOfAutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("puma shoes");
		Thread.sleep(2000);
		List<WebElement> get = driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div/div/div/div"));
		Thread.sleep(2000);
		String exp="puma shoes for boys";
		
		for(WebElement s1:get)
		{
			String act = s1.getText();
			if(act.equals(exp))
			{
				s1.click();
			  break;
			}
		}
	}

}
