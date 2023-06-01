package POM_With_Pagefactory;

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
		login.clickOnSignInBtn();
		
		PBMobNumPage mobnum=new PBMobNumPage(driver);
		mobnum.enterMobNum();
		mobnum.clickOnSignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.enterPwd();
		pwd.clickonSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openMyAccDropDownOptions();
		Thread.sleep(2000);
		
		PBMyAccPage MyAcc=new PBMyAccPage(driver);
		MyAcc.ClickOnMyProfile();
		Thread.sleep(2000);
		
		 PBProfilePage profile=new  PBProfilePage(driver);
		 profile.SwitchToSwitchChildWindow();
		 profile.VarifyFullName();
		 Thread.sleep(3000);
		
		
		 driver.quit();	
		
		
	}

}
