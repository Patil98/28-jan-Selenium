package HandlingOfMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountNumberOfRadioButton
{
	@Test
	public void RadioButton() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://test.rubywatir.com/radios.php");

		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));		

		//find size of RadioButton
		int size = radio.size();
		System.out.println("size of RadioButton is --> " +size);

		driver.close();
	}

}
