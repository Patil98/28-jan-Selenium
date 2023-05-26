package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_GetText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		String te = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
		System.out.println(te);

		Thread.sleep(2000);
		String t = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getText();
		System.out.println(t);
}
}