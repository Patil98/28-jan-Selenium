package ChromeOptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handle_Permission_Pop_ups {
    public static void main(String[] args) {
        
    	ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-media-stream");
	
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(co);

        // Open the website
        driver.get("https://mictests.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Locate and click the 'Test my mic' button
        WebElement micTestButton = driver.findElement(By.xpath("//button[@id='mic-launcher']"));
        micTestButton.click();

        // Add a wait time for observation (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
