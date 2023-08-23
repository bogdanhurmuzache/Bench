package ro.deloitte.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            driver = new FirefoxDriver();
            WebDriverManager.firefoxdriver().setup();
        }
        return driver;
    }

    public static void closeDriverSession(){
        driver.quit();
    }
}
