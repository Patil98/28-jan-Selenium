package ReCaptcha_click;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 
{
	public static void main(String[] args)
	{
	
		ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximized");

		options.addArguments("disable-infobars");

		options.addArguments("--disable-extensions");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://rsps100.com/vote/760");

		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));

		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();

	
	}
}
