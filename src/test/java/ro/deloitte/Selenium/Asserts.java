package ro.deloitte.Selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static ro.deloitte.Selenium.DriverManager.driver;

public class Asserts {
    @Test
    public void testAssertFunctions() {

        driver.get("https://www.browserstack.com/");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
}
