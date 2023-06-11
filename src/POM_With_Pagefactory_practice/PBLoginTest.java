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
	login.clickonsigninbtn();
	Thread.sleep(2000);
	
	
	PBMobNumPage mobnum=new PBMobNumPage(driver);
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
	
	PBMyAccPage myacc=new PBMyAccPage(driver);
	myacc.clickonmyprofile();
	Thread.sleep(2000);
	
	PBProfilePage profile=new PBProfilePage(driver);
	profile.switchtochildwindow();
	profile.varifyfullname();
	Thread.sleep(2000);

		
		 
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
}
	
	
	
}
