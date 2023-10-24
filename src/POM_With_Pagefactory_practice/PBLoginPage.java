package POM_With_Pagefactory_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom_class1
public class PBLoginPage 
{
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signin;
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsigninbtn()
	{
		signin.click();
	}
	
	
	
	
	
	
	
	
}
