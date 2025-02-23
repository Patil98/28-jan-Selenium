package Permission_Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.util.HashMap;

public class HandlePopupsEdge {
	public static void main(String[] args) throws InterruptedException {
		// Create HashMaps to manage permissions
		HashMap<String, Integer> contentSettings = new HashMap<>();
		HashMap<String, Object> profile = new HashMap<>();
		HashMap<String, Object> prefs = new HashMap<>();
		// Set permissions
		contentSettings.put("notifications", 2); // Block notifications
		contentSettings.put("geolocation", 2); // Block geolocation
		contentSettings.put("media_stream", 1); // Allow microphone/camera
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		// Set preferences in EdgeOptions
		EdgeOptions options = new EdgeOptions();
		options.setExperimentalOption("prefs", prefs);
		// Initialize WebDriver
		WebDriver driver = new EdgeDriver(options);
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