package AllSeleniumPrograme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectRandomNumFromDropDown1
{
	@Test
	public void Select() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.findElement(By.xpath("//select")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//option"));
		
		String ExpectedName="Tuvalu";
		
		for(WebElement all:ele)
		{
			String text = all.getText();
			if(text.equals(ExpectedName))
			{
				all.click();				
			}
		}
	
		
		Thread.sleep(2000);
		
		List<WebElement> elel= driver.findElements(By.xpath("//option"));
		for(int i=0; i<elel.size(); i++)
		{
			elel.get(150).click();
		}
		
	}

}
