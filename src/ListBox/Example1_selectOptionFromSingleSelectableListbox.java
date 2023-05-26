package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_selectOptionFromSingleSelectableListbox
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		//step 1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2
		Select s=new Select(month);
		
		//step 3
		//s.selectByVisibleText("Mar");          //String 
		s.selectByValue("11");           //String value
		//s.selectByIndex(5);              //int index
		
	}
	
	
}
