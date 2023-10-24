package ListBox_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example8_selectOptionFromMultiSelectableListbox 
{
public static void main(String[] args) throws InterruptedException
{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.tagName("button")).click();
	driver.findElement(By.xpath("(//span[normalize-space()='PIM'])[1]")).click();
	
	Thread.sleep(2000);
	
	
	WebElement element = driver.findElement(By.xpath("(//span[normalize-space()='Chief Executive Officer'])[1]"));
	
	Select select = new Select(element);
	
//	select.selectByIndex(0);
  select.selectByVisibleText("Chief Executive Officer");
//	select.selectByVisibleText("Wait Commands");
	Thread.sleep(2000);
	/*select.deselectByVisibleText("Wait Commands");
	
	boolean multiple = select.isMultiple();

    if(multiple)
    {
   	 System.out.println("is mutiple");
    }
    else
    {
   	 System.out.println("is not");
    }
    */
	
	//select.deselectAll();
	
	//getFirstSelectedOptionFrom_MultiSelectableListbox
    
//	String text = select.getFirstSelectedOption().getText();
//    System.out.println(text);
 
   /* List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
    for(WebElement all:allSelectedOptions)
    {
    	String text2 = all.getText();
    	System.out.println(text2);
    }*/
    
//	ArrayList a = new ArrayList();
//    List<WebElement> options = select.getOptions();
//    for(WebElement all:options)
//    {
//         a.add(all.getText());
//    	//System.out.println(text);
//  
//    }
//    
//    System.out.println(a);
//    
//    Collections.reverse(a);
//   
//    System.out.println(a);
	
	driver.close();
}
	
}
