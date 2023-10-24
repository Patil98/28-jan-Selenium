package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// handle nptification
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");

		//launch browser
		WebDriver driver=new ChromeDriver(co);

		//maximize browser
		driver.manage().window().maximize();

		//open URL
		driver.get("https://www.redbus.in/");

		//find date picker webelement to perform click action
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		
		String ExpectedDay="10";
		String ExpectedMonthAndYear="Oct 2023";
	    
	    while(true)
	    {
	    	String CalenderMonthAndYear = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
	    	
	    	if(CalenderMonthAndYear.equals(ExpectedMonthAndYear))
	    	{
	    		driver.findElement(By.xpath("//span[text()='"+ExpectedDay+"']")).click();
	    		
	    		break;	
			}  
	    	else 
	    	{
	    		driver.findElement(By.xpath("(//*[@id='Layer_1'])[2]")).click();
			}
	         Thread.sleep(2000);
	     }
	      

}
}
