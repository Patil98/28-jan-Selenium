package ActionsClass_Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example9_KeyBoardAction 
{
	@Test
	public void keyboard() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		WebElement input1 = driver.findElement(By.name("email"));
		WebElement input2 = driver.findElement(By.name("pass"));

		input1.sendKeys("Bhushan");

	/*	Actions act = new Actions(driver);
		act.keyDown(input1, Keys.CONTROL)
		.sendKeys("a").keyDown(input1, Keys.CONTROL).sendKeys("c")
		.keyDown(input2,Keys.CONTROL).sendKeys("v")
		.perform();
		*/
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		

	}


}
