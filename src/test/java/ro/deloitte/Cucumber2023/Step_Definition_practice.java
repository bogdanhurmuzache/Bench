package ro.deloitte.Cucumber2023;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ro.deloitte.Selenium.DriverManager;

import java.time.Duration;

public class Step_Definition_practice {
    protected WebDriver driver;

    public Step_Definition_practice(){
        driver = DriverManager.getDriver();
    }

    @Given("I Access Emag web page")
    public void accessEmag(){

    }
}
