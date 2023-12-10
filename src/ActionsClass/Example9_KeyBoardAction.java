package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example9_KeyBoardAction 
{
	@Test
	public void keyboard()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input1.sendKeys("Welcome to Automation");
		
		Actions act = new Actions(driver);
		
		//ctrl+A
		//act.keyDown(Keys.CONTROL).perform();
		//act.sendKeys("a").perform();
		//act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.CONTROL ,"a").perform();
		
		//ctrl+C
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("c").perform();
		act.keyUp(Keys.CONTROL).perform();
		
		//tab 
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		//ctrl+V
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("v").perform();
		act.keyUp(Keys.CONTROL).perform();
		
	}
	
	
}
