package ro.deloitte.Cucumber2023;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import ro.deloitte.Selenium.DriverManager;

import org.openqa.selenium.WebDriver;
import ro.deloitte.Selenium.DriverManager;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import ro.deloitte.Selenium.DriverManager;

public class Step_Definition_exercise_06 {
    protected WebDriver driver;
    public Step_Definition_exercise_06(){
        driver = DriverManager.getDriver();
    }

    @And("I click the checkbox to select one record saved in the Records Found section")
    public void clickCheckbox(){
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
    }
}
