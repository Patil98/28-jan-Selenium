package POM_With_Pagefactory_practice;
//pom class 5

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage
{
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myprofile;
	@FindBy(xpath = "//span[text()='Sign out']") private WebElement signOut;
	
	public PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonmyprofile()
	{
		myprofile.click();
	}
	public void clickPBMyAccPageSignOut() 
	{
		signOut.click();
	}
	
	
	
	
	
	
	
	
	
}