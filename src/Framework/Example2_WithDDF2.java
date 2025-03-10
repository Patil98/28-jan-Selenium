package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_WithDDF2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		// click on sign in button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		//enter mob num
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());

		//click on signIn with pwd btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();		

		//enter pwd
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());

		//click on signIn btn
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		Thread.sleep(2000);

		//open my account dropdown options
		WebElement get = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(get).perform();
		Thread.sleep(2000);

		//click on my profile btn
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Thread.sleep(2000);


		//switch to child window
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(allid);
		driver.switchTo().window(a.get(1));
		Thread.sleep(2000);

		//get full name
		String actText= driver.findElement(By.xpath("//input[@id='outlined-secondary']")).getAttribute("value");

		String exp=sh.getRow(0).getCell(2).getStringCellValue();

		if(exp.equals(actText))
		{
			System.out.println("TC is pass");
		}
		else
		{
			System.out.println("TC is fail");
		}
	}

}
