package POM_With_Pagefactory_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLogoutTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickonsigninbtn();		
		
		 PBMobNumPage mobnum=new  PBMobNumPage(driver);
		 mobnum.entermobnum();
		 mobnum.clickonsigninwithbtn();
		 Thread.sleep(2000);
		
		 PBPwdPage pwd=new PBPwdPage(driver);
		 pwd.enterpwd();
		pwd.clickonsigninbtn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openmyaccdropdown();
		Thread.sleep(2000);
		
		PBMyAccPage acc=new PBMyAccPage(driver);
		acc.clickPBMyAccPageSignOut();
		Thread.sleep(2000);
		
		driver.quit();

}
}