package HandlingOfWebTable_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		
		//String text = driver.findElement(By.xpath("(//tr)[2]")).getText();
		//System.out.println(text);
		
		List<WebElement> option = driver.findElements(By.cssSelector("tbody>tr>td"));

        for(WebElement all:option)
        {
        	System.out.println(all.getText());
        }
	}

}
