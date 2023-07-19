package ro.deloitte.ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationBootcampStep {

    private WebDriver driver;

    private String wordToBePrinted;

    @Before("@uiDemo")
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After("@uiDemo")
    public void quitDriver() {
        driver.quit();
    }

    @Given("The word {string} is set")
    public void theWordIsSet(String wordToBeSet) {
        wordToBePrinted = wordToBeSet;
    }

    @Given("The Deloitte Digital page is accessed")
    public void accessDeloittePage() {
        driver.get("https://www.deloittedigital.com/");
    }

    @When("I print it in the console")
    public void whenIPrintItInTheConsole() {
        System.out.println(wordToBePrinted);
    }
}
