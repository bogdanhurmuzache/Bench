package ro.deloitte.ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bench {

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


    public static void main(String[] args) {
        //System.out.println("QA Automation");
        //System.out.println("Something");
        //System.out.println("13");
        //System.out.println(10);
        //System.out.println(10 + 13);

        //Comment
        //System.out.println("First Comment");
        //System.out.println("Second comment"); // Second comment

        /* Comment
        more
        then one line */

        //System.out.println("This sentence will work!");
        //System.out.println(This sentence will produce an error);

        //System.out.print("Hello World! ");
        //System.out.print("I will print on the same line.");
        //System.out.println("STOP");

        //System.out.print("First line.");
        //System.out.print("Second line.");
        //System.out.println("STOP");

        int myFirstNumber = 10;
        System.out.println("myFirstNumber");
        System.out.println(myFirstNumber);
        myFirstNumber = 13;
        System.out.println(myFirstNumber);


    }
}


