
package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calendars_v2 {
    protected WebDriver driver;

    public Calendars_v2(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {
        driver.get("https://seleniumpractise.blogspot.com/2016/08/");
        Thread.sleep(3000 );

        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//a[text()='31']")).click();

        driver.fin



        /*driver.findElement(By.xpath("//a[@data-handler='next']/a[text()='December']")).click();
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='25']")).click();
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='25']")).click();

        String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
        String actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();*/






        Thread.sleep(4000);

        driver.quit();

    }
}



