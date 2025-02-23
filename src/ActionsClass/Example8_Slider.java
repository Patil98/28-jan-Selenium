package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example8_Slider 
{
	@Test
	public void slider() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		// left slider
		WebElement slider = driver.findElement(By.xpath("//span[1]"));

		System.out.println("get location of element: "+slider.getLocation());
		System.out.println("get heigth and width of element: "+slider.getSize());

		Thread.sleep(3000);

		Actions act = new Actions(driver);
		// left slider
		act.dragAndDropBy(slider, 100, 250).perform();;

		// rigth slider
		WebElement slide = driver.findElement(By.xpath("//span[2]"));

		System.out.println("get location of element: "+slide.getLocation());
		System.out.println("get heigth and width of element: "+slide.getSize());

		act.dragAndDropBy(slide, -150, 0).perform();
		
		driver.quit();

	}

}
