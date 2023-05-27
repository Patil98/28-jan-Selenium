package HandlingOfWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(2000);
		
		int get = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println(get);
		
		
	}

}
