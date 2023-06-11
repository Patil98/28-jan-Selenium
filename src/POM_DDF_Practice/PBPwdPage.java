package POM_DDF_Practice;
//pom class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{
	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement SignIn;
	
	public  PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBPwdPagePwd(String password)
	{
		Pwd.sendKeys(password);
	}
	
	public void ClickPBPwdPageSignIn()
	{
		SignIn.click();
	}
	
}
