package AllSeleniumPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class GoogleClickMic {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Maximize the browser window
            driver.manage().window().maximize();
            
            // Navigate to Google
            driver.get("https://www.google.com");
            
            // Implicit wait to ensure element is loaded
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            // Locate the element using XPath and click it
            WebElement element = driver.findElement(By.xpath("//div[@class='XDyW0e']"));
            element.click();
            
            // Wait for a few seconds to observe the result (optional)
            Thread.sleep(3000);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

