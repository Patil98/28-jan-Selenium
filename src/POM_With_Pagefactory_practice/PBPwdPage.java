package POM_With_Pagefactory_practice;
//pom class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage
{
	
	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement SignIn;
	
	PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPwd()
	{
		Pwd.sendKeys("bhushan98");
	}
	
	public void ClickOnSignIn()
	{
		SignIn.click();
	}
	
	
	
	
	
	
}
