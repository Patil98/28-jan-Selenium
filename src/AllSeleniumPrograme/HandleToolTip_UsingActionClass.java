package AllSeleniumPrograme;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleToolTip_UsingActionClass 
{
	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/social-icon.html");

		String expectedTooltip = "Facebook";

		// Instantiate Action Class
		Actions actions = new Actions(driver);

		// Retrieve WebElement
		WebElement element = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-facebook']"));

		// Using the action class to mimic mouse hover
		actions.moveToElement(element).perform();

		// To get the tool tip text and assert
		String ActualToolTipText = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-facebook']")).getAttribute("titl");
		

		// Assertion
		assertEquals(ActualToolTipText, expectedTooltip, "Test case failed");
		
		System.out.println("Actual tooltip text is--->> "+ActualToolTipText );
		
		System.out.println("test case passed");

		driver.close();

	}
}