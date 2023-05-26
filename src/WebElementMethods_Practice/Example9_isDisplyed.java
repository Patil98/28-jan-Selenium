package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_isDisplyed 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		boolean display = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/header/div/div[1]/a/div")).isDisplayed();
             System.out.println(display);
}
}