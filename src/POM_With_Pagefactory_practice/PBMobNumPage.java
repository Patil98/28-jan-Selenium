package POM_With_Pagefactory_practice;
//pom class 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;
	
	 PBMobNumPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void EnterMobNum()
	 {
		 MobNum.sendKeys("9075111787");
	 }
	 
	 public void  clickOnsignInWithPwd()
	 {
		 signInWithPwd.click();
	 
	 }
	
	
	
	
}
