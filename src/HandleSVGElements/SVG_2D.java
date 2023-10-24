package HandleSVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVG_2D 
{
	@Test
	public void svg() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SVGElements.html");
		
		//rectagle
		String heigth = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='rect']")).getAttribute("height");	
		System.out.println(heigth);
		
		//circle
		String stroke = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("stroke");	
		System.out.println(stroke);
		
		
		//flipkart search click SVG elements
		// (//*[name()='svg']//*[local-name()='path'])[1]
		
	}

}
