package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		//open the application
		js.executeScript("window.location='https://www.amazon.in/'");

		//send input
		js.executeScript("document.getElementById('twotabsearchtextbox').value='redmimobile';");

		// return input 
		String value = js.executeScript("return document.getElementById('twotabsearchtextbox').value").toString();
		System.out.println(value);

		//click
		js.executeScript("document.getElementById('nav-search-submit-button').click();");

		//refresh the browser
		js.executeScript("history.go(0)");

		//to draw border around the element
		WebElement Element = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].style.border='10px solid red';",Element);

		//to zoom the page
		js.executeScript("document.body.style.zoom='150%'");

		//to get height and width of the web page
		String Height = js.executeScript("return window.innerHeight;").toString();
		System.out.println(Height);
		String Width = js.executeScript("return window.innerWidth;").toString();
		System.out.println(Width);

		//to perform scroll action
		//scroll vertically till the bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(2000);

		//scroll vertically till the top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		//generate alert popup
		js.executeScript("alert('bhushan patil');");

	}

}
