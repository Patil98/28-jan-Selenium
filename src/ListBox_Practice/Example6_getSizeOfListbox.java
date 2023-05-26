package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_getSizeOfListbox 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	WebElement c = driver.findElement(By.xpath("//select[@id='day']"));
	
	Select s=new Select(c);
	int get = s.getOptions().size();
	System.out.println(get);

}
}