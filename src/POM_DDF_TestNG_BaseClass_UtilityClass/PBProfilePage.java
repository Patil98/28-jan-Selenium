package POM_DDF_TestNG_BaseClass_UtilityClass;
//pom class 6

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{	

	@FindBy(xpath="//input[@name='personName']") private WebElement FullName;
	WebDriver driver1;
	

	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchToChildWindow()
	{
		Set<String> all = driver1.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(all);
		driver1.switchTo().window(a.get(1));
	}
	
	public String VarifyPBProfilePageFullName()
	{
		 String actname = FullName.getAttribute("value");
	      return actname;
	
	}

	
	
	
}
