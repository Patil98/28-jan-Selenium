package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PBLoginTest1 extends BaseClass
{
	PBLoginPage login;
	PBMobNumPage mobnum;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	int TCID;


	@Parameters("Browsername")
	@BeforeClass
	public void openBrowser( String Browsername) throws EncryptedDocumentException, IOException 
	{
		IntializeBrowser(Browsername);

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
		mobnum.inpPBMobNumPageMobNum(UtilityClass.getPFData("MobNum"));
		mobnum.clickPBMobNumPagePBMobNumPage();
		Thread.sleep(3000);
		pwd.inpPBPwdPagePwd(UtilityClass.getPFData("PWD"));
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(3000);

	}

	@Test
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID=102;
		home.OpenDDOptionPBHomePageMyAcc();
		Thread.sleep(3000);
		myacc.clickPBMyAccPageMyProfile();
		profile.SwitchToChildWindow();
		//profile.VarifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());

		String actResult= profile.VarifyPBProfilePageFullName();
		String ExpResult=UtilityClass.getTestData(0, 2);
		Assert.assertEquals(actResult, ExpResult);

	}

	@AfterMethod
	public void logoutFromApp(ITestResult s) throws IOException 
	{
		if(s.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();		
	}
}
