package HandleSVGElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVG_3D 
{
	@Test
	public void svg() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();

		driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
		Thread.sleep(2000);
		driver.switchTo().frame("logo");
		while(true)
		{
			List<WebElement> eleList = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g']//*[local-name()='path']"));

			for(WebElement all:eleList)
			{
				String att = all.getAttribute("d");
				System.out.println(att);
			}
		}	
	}
}
