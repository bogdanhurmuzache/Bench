package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getAttribute {
    protected WebDriver driver;

    public getAttribute(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {

        driver.get("https://login.yahoo.com/?lang=ro-RO&src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F&add=1");
        Thread.sleep(3000);

        String textInainte = driver.findElement(By.id("login-signin")).getAttribute("value");
        System.out.println(textInainte);

        Thread.sleep(4000);

        driver.quit();

    }
}
