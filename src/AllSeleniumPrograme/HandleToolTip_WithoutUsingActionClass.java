package AllSeleniumPrograme;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleToolTip_WithoutUsingActionClass
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/social-icon.html");

		String expectedTooltip="Github";

		// Find the Github icon expectedTooltip at the top right of the header
		String ActualTootip = driver.findElement(By.xpath("(//a[@title='Github'])[2]")).getAttribute("title");

		// assertion
		assertEquals(ActualTootip, expectedTooltip, "Tast Case failed");
        
		System.out.println("Actual tooltip text is--->> "+ActualTootip );
		
		System.out.println("Test Case Passed");
		
		// close
		driver.close();

	}

}
