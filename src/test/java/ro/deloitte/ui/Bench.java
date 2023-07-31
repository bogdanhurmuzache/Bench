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

                                        // Cmments

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



                                            // Variables

        /*int myFirstNumber = 10;
        System.out.println("myFirstNumber");
        System.out.println(myFirstNumber);
        myFirstNumber = 13;
        System.out.println(myFirstNumber);
        myFirstNumber = 10 + 13;
        System.out.println(myFirstNumber);
        myFirstNumber = (10 + 10) + (13 * 10);
        System.out.println(myFirstNumber);*/

        /*int myFirstNumber = (10 + 10) + (13 * 10);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        System.out.println(mySecondNumber);

        int myThirdNumber = 6;
        System.out.println(myThirdNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println((myTotal));

        myThirdNumber = myFirstNumber * 2;
        System.out.println(myThirdNumber);

        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println((myTotal));*/



                                                    // Primitive Types

        /*int myValue = 10000;
        System.out.println(myValue);

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMaxIntValue);*/

                                                    // Floating Point Precision

        /*int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        myIntValue = 5 / 2;
        System.out.println(myIntValue);

        myFloatValue = 5f / 2f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);*/


                                                    // Operators, Operands and Expressions

        int results = 1 + 2;
        System.out.println(results);

        int previousResults = results;
        System.out.println(results);

        results = results - 1;
        System.out.println(results);

        System.out.print("previousResults = " + previousResults);
// SPACE ????
        int resultsA = 10;
        resultsA++;
        System.out.println(resultsA);
    }
}


