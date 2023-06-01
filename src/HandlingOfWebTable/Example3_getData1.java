package HandlingOfWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getData1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(2000);
      String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr[26]/td[1]")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		//header
		String tex = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[5]")).getText();
		System.out.println(tex);
		
		
	}

}
