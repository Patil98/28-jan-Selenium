package HandlingOfMultipleElements_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_sendkeyinMultipletextboxes

{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/bvp13/OneDrive/Documents/basic%20html%20coding/Handling%20of%20Multiple%20Elements.html");
	
	List<WebElement> text = driver.findElements(By.xpath("//input[@type='text']"));
	
	text.get(0).sendKeys("bhushan");
	
	text.get(1).sendKeys("patil");
}
}
