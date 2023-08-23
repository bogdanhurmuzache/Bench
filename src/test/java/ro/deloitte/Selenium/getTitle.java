package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getTitle {
    protected WebDriver driver;

    public getTitle() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(1000);
        driver.quit();
    }
}
