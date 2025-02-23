package com.crossbrowsertesting.framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class CrossBrowserTestSuite {
    WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setup(String browser) {
        driver = BrowserDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Page Title is: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
