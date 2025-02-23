package AllSeleniumPrograme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandalingBootStrapDropDown
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");

		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='dropdown'])[1]")).click();

		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		int size = options.size();
		System.out.println(size);
        selectoption(options, "Life Insurance");
        driver.quit();
		

	}

	public static void selectoption(List<WebElement> options,String value)
	{
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}

	}


}
