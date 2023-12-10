package AllSeleniumPrograme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get 
{
	@Test
	public void getattribute() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");

		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> ele = driver.findElements(By.cssSelector("span[class='a-price-whole']"));

		ArrayList<Integer> ar = new ArrayList<Integer>();

		for(WebElement each:ele)
		{
			ar.add(Integer.parseInt(each.getText().replaceAll(",", ""))); 		
		}

		Collections.sort(ar);

		System.out.println(ar);

		Thread.sleep(3000);
		driver.close();

	}

}
