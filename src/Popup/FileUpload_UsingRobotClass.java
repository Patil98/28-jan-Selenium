package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_UsingRobotClass 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		

		WebElement ChooseFile = driver.findElement(By.id("file-upload"));

		// to click on ChooseFile element
		Actions ele = new Actions(driver);
		ele.moveToElement(ChooseFile).click().perform();

		// to upload the file using robot class[if input type=file is not mention there]
		Robot rb = new Robot();
		rb.delay(2000);

		// to copy file path in clipboard
		StringSelection ss = new StringSelection("C:\\Users\\bvp13\\Downloads\\The-Vibrant-Diversity-of-India.pptx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// to perform control+V action to paste the file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		// click on upload button
		//driver.findElement(By.id("file-submit")).click();

	}
}