package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropWithoutMethod 
{
	@Test
	public void DragAndDrop() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//drag and drop Without using draganddrop method
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(dest).release().perform();
		act.clickAndHold(src).release(dest).perform();
	
	}

	
}
