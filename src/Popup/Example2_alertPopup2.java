package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_alertPopup2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("111");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

		//switch to alert popup
		Alert alt = driver.switchTo().alert();

		//1: getText from alert popup
		String text = alt.getText();
		System.out.println(text);

		Thread.sleep(2000); 


		//       //2: click on cancel btn from alert popup
		//       alt.dismiss();

		Thread.sleep(2000); 

		//3: click on "OK" btn from 1st alert popup
		alt.accept();

		Thread.sleep(2000); 

		//3: click on "OK" btn from 2nd alert popup
		alt.accept();

	}


}
