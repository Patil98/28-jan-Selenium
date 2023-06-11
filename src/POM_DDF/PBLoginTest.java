package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignIn();
		Thread.sleep(2000);
		
		PBMobNumPage mobnum=new PBMobNumPage(driver);
		String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPageMobNum(mobilenum);
		mobnum.clickPBMobNumPagePBMobNumPage();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();		
		pwd.inpPBPwdPagePwd(password);
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.OpenDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
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
