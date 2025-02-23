package Permission_Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlePopupsFirefox {
	public static void main(String[] args) throws InterruptedException {
		// Create FirefoxProfile
		FirefoxProfile profile = new FirefoxProfile();
		// Set preferences for notifications, geolocation, and media stream
		profile.setPreference("permissions.default.geo", 2); // Block geolocation
		profile.setPreference("permissions.default.desktop-notification", 2); // Block notifications
		profile.setPreference("permissions.default.microphone", 1); // Allow microphone access
		// Set the profile in FirefoxOptions
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		// Initialize WebDriver
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		// Test notification permission pop-up
		driver.get("https://www.cleartrip.com/");

		// Test location permission pop-up
		driver.get("https://whatmylocation.com/");

		// Test microphone permission pop-up
		driver.get("https://mictests.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("mic-launcher")).click();

		//To verify camera based permission popup
		driver.get("https://webcamtests.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("webcam-launcher")).click();

		// Your test logic here

		driver.quit();
	}
}