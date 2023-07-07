package POM_DDF_TestNG;

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

public class PBLoginTest1
{
	WebDriver driver;
	Sheet sh;
	PBLoginPage login;
	PBMobNumPage mobnum;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{

		FileInputStream file=new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		 driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		login=new PBLoginPage(driver);
	    mobnum=new PBMobNumPage(driver);
		 pwd=new PBPwdPage(driver);
	     home=new PBHomePage(driver);
		 myacc=new PBMyAccPage(driver);
		 profile=new PBProfilePage(driver);
		
		
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException 
	{
		login.clickPBLoginPageSignIn();
		mobnum.inpPBMobNumPageMobNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobnum.clickPBMobNumPagePBMobNumPage();
		Thread.sleep(3000);
		pwd.inpPBPwdPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void verifyFullName() throws InterruptedException 
	{
		home.OpenDDOptionPBHomePageMyAcc();
		Thread.sleep(3000);
		 myacc.clickPBMyAccPageMyProfile();
		 profile.SwitchToChildWindow();
		// profile.VarifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
		 
		 String actResult= profile.VarifyPBProfilePageFullName();
		 String ExpResult=sh.getRow(0).getCell(2).getStringCellValue();
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
