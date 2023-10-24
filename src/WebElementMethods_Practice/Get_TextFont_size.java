package WebElementMethods_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_TextFont_size 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	/*
    We use .getCssValue(attribute) method to get the properties of any webelement.
	We can pass the following attributes:
	1.font-family
	2.font-size
	3.color
	4.line-height 
	5.background
	6.background-color
	*/
	
	String fontSize = driver.findElement(By.xpath("//h2")).getCssValue("background");
	System.out.println(fontSize);
	
	Thread.sleep(1000);
	
	String color = driver.findElement(By.xpath("//h2")).getCssValue("color");
	System.out.println(color);
		
    Thread.sleep(1000);
	
	String family = driver.findElement(By.xpath("//h2")).getCssValue("font-family");
	System.out.println(family);
	
	
	String background = driver.findElement(By.xpath("//h2")).getCssValue("background");
	System.out.println(background);
	

	
	
	
}
}
