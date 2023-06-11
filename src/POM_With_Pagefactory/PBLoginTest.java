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
		login.clickPBLoginPageSignIN();
		
		PBMobNumPage mobnum=new PBMobNumPage(driver);
		mobnum.inpPBMobNumPageMobNum();
		mobnum.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inpPBPwdPagePWD();
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage  acc=new  PBMyAccPage(driver);
		acc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		 PBProfilePage profile=new  PBProfilePage(driver);
		 profile.SwitchToSwitchChildWindow();
		 profile.verifyPBProfilePageFullName();
			Thread.sleep(2000);
			
		 driver.quit();	
		
		
	}

}
