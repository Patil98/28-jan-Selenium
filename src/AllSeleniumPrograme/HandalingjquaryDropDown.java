package AllSeleniumPrograme;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingjquaryDropDown 
{	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		//selectchoicevalue(driver,"choice 2 1","choice 2 2","choice 6");
		//selectchoicevalue(driver,"choice 6");
		selectchoicevalue(driver,"all");

	}

	public static void selectchoicevalue(WebDriver driver, String...value)
	{
		List<WebElement> choicelist= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choicelist)
			{
				String text = item.getText();
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}

			}
		}
		else
		{
			try
			{
				for(WebElement item:choicelist)
				{
					item.click();
				}
			}
			catch(Exception e)
			{

			}

		}

	}

}
