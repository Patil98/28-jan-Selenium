package POM_With_Pagefactory_practice;
//pom class 6

import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{
	
	@FindBy(xpath="//input[@id='outlined-secondary']") private WebElement fullname;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchtochildwindow()
	{
		Set<String> all = driver1.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(all);
		driver1.switchTo().window(a.get(1));
	}
	
	 public void varifyfullname()
	 {
		 String actname = fullname.getAttribute("value");
		 String expname="bhushan patil";
		 
		 if(actname.equals(expname))
		 {
			 System.out.println("TC is pass");
		 }
		 else
		 {
			 System.out.println("TC is fail");
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
