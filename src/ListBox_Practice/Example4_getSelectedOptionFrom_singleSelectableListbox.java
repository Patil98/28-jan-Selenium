package ListBox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getSelectedOptionFrom_singleSelectableListbox
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select s=new Select(d);
		s.selectByIndex(5);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
	}

}
