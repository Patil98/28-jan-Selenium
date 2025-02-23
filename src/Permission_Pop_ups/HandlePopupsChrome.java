package Permission_Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;

public class HandlePopupsChrome {
	public static void main(String[] args) throws InterruptedException {
		
//		0 → Default behavior (let Chrome decide based on global settings)
//		1 → Allow (grant permission)
//		2 → Block (deny permission)
		
		// Create HashMaps to manage permissions
		HashMap<String, Integer> contentSettings = new HashMap<>();
		HashMap<String, Object> profile = new HashMap<>();
		HashMap<String, Object> prefs = new HashMap<>();
		// Set permissions for notifications, geolocation, and media stream (microphone/camera)
		contentSettings.put("notifications", 2); // Block notifications
		contentSettings.put("geolocation", 2); // Block geolocation (location access)
		contentSettings.put("media_stream", 1); // Allow microphone/camera access
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		// Set preferences in ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver(options);
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