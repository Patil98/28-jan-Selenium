package ListBox_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelect 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retool.com/components/multiselect-listbox");


		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_o9MBb']//div"));

		String option1="Henrietta";
		
		for(WebElement op:all)
		{
			String te= op.getText();
			if(te.equals(option1) )
			{
				op.click();
				break;
			}

		}
		
		//driver.close();
	}

}


