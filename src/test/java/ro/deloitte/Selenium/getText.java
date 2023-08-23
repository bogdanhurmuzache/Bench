package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getText {


    protected WebDriver driver;

    public getText(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
        Thread.sleep(3000);

        String text = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).
                getText();
        System.out.println(text);

        Thread.sleep(1000);
        driver.quit();
    }
}
