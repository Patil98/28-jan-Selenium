package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_Click_on_elements 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
	
		// send keys
		// js.executeScript("document.getElementById('twotabsearchtextbox').value='shoes';");
		// (OR) 
		//WebElement click = driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
			Thread.sleep(2000);
		//click
		//js.executeScript("arguments[0].click();",click);
		// (OR) 
		//js.executeScript("document.getElementById('nav-search-submit-button').click();");
		
		
		// page refresh
	  // js.executeScript("history.go(0)");
		
		// get all text
	//	String sText =  js.executeScript("return document.documentElement.innerText;").toString();
	//	System.out.println(sText);
		
		
		//get title
		String sText =  js.executeScript("return document.title;").toString();
		System.out.println(sText);
		
		//get domain
		String sTex =  js.executeScript("return document.domain;").toString();
		System.out.println(sTex);
		
		//get url
		String sTe =  js.executeScript("return document.URL;").toString();
	System.out.println(sTe);
		
		//get text
		String text = js.executeScript("return document.getElementById('glow-ingress-line2').innerHTML").toString();
		System.out.println(text);
		
		
		
}
}