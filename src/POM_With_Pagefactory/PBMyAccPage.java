package POM_With_Pagefactory;
//pom class 5

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
	
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
	

	PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMyProfile()
	{
		myProfile.click();
	}
	
}
