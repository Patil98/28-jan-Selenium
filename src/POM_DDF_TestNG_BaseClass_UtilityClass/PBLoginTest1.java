package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1 extends BaseClass
{

	
	PBLoginPage login;
	PBMobNumPage mobnum;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		IntializeBrowser();
          
		login=new PBLoginPage(driver);
	    mobnum=new PBMobNumPage(driver);
		 pwd=new PBPwdPage(driver);
	     home=new PBHomePage(driver);
		 myacc=new PBMyAccPage(driver);
		 profile=new PBProfilePage(driver);
		
		
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		login.clickPBLoginPageSignIn();
		mobnum.inpPBMobNumPageMobNum(UtilityClass.getTestData(0, 0));
		mobnum.clickPBMobNumPagePBMobNumPage();
		Thread.sleep(3000);
		pwd.inpPBPwdPagePwd(UtilityClass.getTestData(0, 1));
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		home.OpenDDOptionPBHomePageMyAcc();
		Thread.sleep(3000);
		 myacc.clickPBMyAccPageMyProfile();
		 profile.SwitchToChildWindow();
		// profile.VarifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
		 
		 String actResult= profile.VarifyPBProfilePageFullName();
		 String ExpResult=UtilityClass.getTestData(0, 2);
		 Assert.assertEquals(actResult, ExpResult);
		 
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();		
	}
}
