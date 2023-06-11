package POM_With_Pagefactory;
//pom class 6

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{
	
	@FindBy(xpath="//input[@id='outlined-secondary']") private WebElement fullname;
	WebDriver driver1;
	
	
	public 	PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchToSwitchChildWindow()
	{
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(allid);
		driver1.switchTo().window(a.get(1));	
	}
	
	public void verifyPBProfilePageFullName()
	{
		String actname = fullname.getAttribute("value");
		String extname="bhushan patil";
		
		if(actname.equals(extname))
		{
			System.out.println("Tc is pass");
		}
		else
		{
			System.out.println("Tc is fail");
		}
	}
	
	
	
	

}
