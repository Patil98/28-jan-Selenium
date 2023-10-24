package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_isDisplyed1
{

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();

		driver.get("https://in.sugarcosmetics.com/");

		boolean r = driver.findElement(By.xpath("//div[@class='col-2 d-flex justify-content-center']")).isDisplayed();
		System.out.println(r);

	}

}
