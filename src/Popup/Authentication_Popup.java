package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup
{
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		//Set the username
		//String username = "admin";

		//Set the password
		//String password = "admin";

		//URl=https://the-internet.herokuapp.com/basic_auth

		Thread.sleep(2000);
		String URL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(URL);


		String title = driver.getTitle();
		System.out.println("The page title is "+title);
		Thread.sleep(2000);

		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println("The test present in page is ==> "+text);

		//driver.close();
		driver.quit();


	}
}
