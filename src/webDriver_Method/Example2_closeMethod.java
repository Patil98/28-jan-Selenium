package webDriver_Method;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example2_closeMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='_deals-shoveler-v2_style_dealImage__3nlqg'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Thread.sleep(2000);
	      driver.quit();
		
	}

}
