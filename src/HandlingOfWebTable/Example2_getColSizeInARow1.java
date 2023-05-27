package HandlingOfWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInARow1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(2000);
		
		//  for normal row
		int get = driver.findElements(By.xpath("//table[@class='dataTable']//tr[3]/td")).size();
		System.out.println(get);
		
		//for header
		int size = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		System.out.println(size);
		
	}

}
