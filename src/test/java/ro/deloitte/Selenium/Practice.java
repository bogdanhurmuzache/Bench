package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

    protected WebDriver driver;

    public Practice(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bhurmuzache/Desktop");
        //driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
    }

}

