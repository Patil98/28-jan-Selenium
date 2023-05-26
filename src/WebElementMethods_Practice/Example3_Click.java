package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_Click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 Thread.sleep(2000);
		 
		WebElement g = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	    g.sendKeys("t-shirt");
	    Thread.sleep(2000);
	    WebElement c = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	    c.click();
		
	    
		 Thread.sleep(2000);
		 g.sendKeys("redmi note ll pro");
		 Thread.sleep(2000);
		 c.click();
		 Thread.sleep(2000);
		   g.clear();
}
}