package HandlingOfAutoSugetions_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("one plus");
		Thread.sleep(1000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(1000);
		
		String Exp="oneplus nord ce 2 5g";
		
		for(WebElement s:all)
		{
			String act = s.getText();
			if(act.equals(Exp))
			{
				s.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
