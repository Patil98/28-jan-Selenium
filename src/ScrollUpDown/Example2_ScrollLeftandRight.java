package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_ScrollLeftandRight 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//executeScript("window.scrollBy(x-pixels,y-pixels)");
		//right scroll
		((JavascriptExecutor)driver).executeScript("window.scrollBy(20000,0)");
		
		Thread.sleep(2000);
		
		//left scroll
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-10000,0)");
		
	}

}
