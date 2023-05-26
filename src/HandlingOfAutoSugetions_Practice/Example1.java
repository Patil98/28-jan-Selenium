package HandlingOfAutoSugetions_Practice;

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
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("asian");
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		String Exp="asian sneakers for men";
		
		for(WebElement s1:all)
		{
			String act = s1.getText();
			if(act.equals(Exp))
			{
				s1.click();
			     break;
			}
		}
	}
}
