package POM_DDF_Practice;
//pom class 6

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{	

	@FindBy(xpath="//input[@name='personName']") private WebElement Fullname;
	WebDriver driver1;

	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SwitchToChildWindow()
	{
		Set<String> all = driver1.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(all);
		driver1.switchTo().window(a.get(1));
	}
	
	public void VarifyPBProfilePageFullName(String expname)
	{
		 String actname = Fullname.getAttribute("value");
				 
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