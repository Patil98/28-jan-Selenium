package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 1
public class PBLoginPage 
{

	//step1: declaration
@FindBy(xpath="//a[text()='Sign in']") private WebElement signIN;             //private WebElement signIN=driver.findElement(By.xpath(""))
	
	
//step2: initialization
PBLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);          //diffClassName.methodname(webDriver_Object, this_Keyword);
}
	
//step3: usage
public void clickOnSignInBtn()
{
	 signIN.click();
}
	
	
	
	
	
	
	
	
	
	
}
