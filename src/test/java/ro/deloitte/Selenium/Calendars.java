package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calendars {
    protected WebDriver driver;

    public Calendars(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {

        driver.get("https://seleniumpractise.blogspot.com/2016/08/");
        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(10000);

        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));*/

        String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
        String actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();

        while (!(actualMonth.equals("September")) && (actualYear.equals("2024"))){

            driver.findElement(By.xpath("//a[@data-handler='next']")).click();
            actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
            actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
        }

        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='23']")).click();

        Thread.sleep(10000);

        driver.quit();

    }
}
