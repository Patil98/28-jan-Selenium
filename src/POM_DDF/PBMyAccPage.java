package POM_DDF;
//pom class 5

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage
{
	
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
	@FindBy(xpath="//span[text()='Sign out']") private WebElement SignOut;
	
	
	public  PBMyAccPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void clickPBMyAccPageMyProfile()
	{
		MyProfile.click();
	}
	
	public void clickPBMyAccPageMySignOut()
	{
		SignOut.click();
	}
	
	
}
