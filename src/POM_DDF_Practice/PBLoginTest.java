package POM_DDF_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_DDF.PBProfilePage;

public class PBLoginTest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	
		
	FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");	
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");	
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
	PBLoginPage login=new PBLoginPage(driver);
	login.ClickPBLoginPageSignIn();
	
	 PBMobNumPage mobnum=new  PBMobNumPage(driver);
	String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
	 mobnum.inpPBMobNumPageMobNum(mobilenum);	
	 mobnum.clickPBMobNumPageSignInWithPwd();
	 Thread.sleep(2000);
	 
	 PBPwdPage pwd=new PBPwdPage(driver);
	 String password = sh.getRow(0).getCell(1).getStringCellValue();
	 pwd.inpPBPwdPagePwd(password);
	 pwd.ClickPBPwdPageSignIn();
	 Thread.sleep(2000);
	
	 PBHomePage home=new  PBHomePage(driver);
	 home.openDDOptionsPBHomePageMyAcc();
	 Thread.sleep(2000);
	 
	 PBMyAccPage myacc=new  PBMyAccPage(driver);
	 myacc.clickPBMyAccPageMyProfile();
	 Thread.sleep(2000);
	 
	    PBProfilePage profile=new PBProfilePage(driver);
		profile.SwitchToChildWindow();
		String expfullname = sh.getRow(0).getCell(2).getStringCellValue();
		profile.VarifyPBProfilePageFullName(expfullname);
		Thread.sleep(2000);
		
	
      driver.quit();
	
	
	
	
	
		
	}
}
