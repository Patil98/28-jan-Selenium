package POM_With_Pagefactory_practice;
//pom class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage
{
	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement signin;
	
	
 public  PBPwdPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
	
 public void enterpwd()
 {
	 pwd.sendKeys("bhushan98");
 }
 
 public void clickonsigninbtn()
 {
	 signin.click();
 }
 
 
}
