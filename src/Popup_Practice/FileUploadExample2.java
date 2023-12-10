package Popup_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadExample2
{
	@Test	
	public void upload() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Add Files']")).click();

		// to upload the file using robot class[if input type=file is not mention there]
		Robot rb = new Robot();
		rb.delay(2000);

		// to copy file path in clipboard
		StringSelection ss = new StringSelection("C:\\Users\\bvp13\\Downloads\\QA_Assignment.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// to perform control+V action to paste the file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
