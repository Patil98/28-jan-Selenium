package POM_With_Pagefactory_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	PBLoginPage login=new PBLoginPage(driver);
	login.clickonsignin();		
	
	PBMobNumPage mobnum=new PBMobNumPage(driver);
	mobnum.EnterMobNum();
	mobnum.clickOnsignInWithPwd();
	Thread.sleep(3000);
	
	PBPwdPage pwd=new PBPwdPage(driver);
	pwd.EnterPwd();		
	pwd.ClickOnSignIn();
	Thread.sleep(3000);
	
	PBHomePage home=new PBHomePage(driver);
	home.OpenMyAccDropDownOptions();
	Thread.sleep(3000);
	
	PBMyAccPage myacc=new PBMyAccPage(driver);
    myacc.ClickOnMyProfile();
    Thread.sleep(3000);
    
    PBProfilePage profile=new PBProfilePage(driver);
    profile.SwitchToSwitchChlidWindow();
    profile.varifyFullName();
    Thread.sleep(3000);
    
    driver.quit();
	
	
	
}
	
	
	
}
