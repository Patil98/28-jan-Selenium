package com.crossbrowsertesting.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BrowserDriverFactory {
    private static final Map<String, Supplier<WebDriver>> driverMap = new HashMap<>();

    static {
        driverMap.put("chrome", () -> {
             return new ChromeDriver();
        });

        driverMap.put("firefox", () -> {
             return new FirefoxDriver();
        });

        driverMap.put("edge", () -> {
            return new EdgeDriver();
        });
    }

    public static WebDriver getDriver(String browser) {
        return driverMap.getOrDefault(browser.toLowerCase(), () -> {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }).get();
    }
}
