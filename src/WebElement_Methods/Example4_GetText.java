package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_GetText

{
	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		// System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten
		// password?']")).getText());

		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(text);

		String te = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
		System.out.println(te);

		String tex = driver.findElement(By.xpath("//button[@name='login']")).getText();
		System.out.println(tex);
	}
}
