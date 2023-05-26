package HandlingOfWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInARow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/example5.html");
		
		
		Thread.sleep(2000);
		
		int columnsize = driver.findElements(By.xpath("//table[@id='1234']//tr[3]/td")).size();
		System.out.println(columnsize);
		
		
		//for header
        int header = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(header);
		
		
	}

}
