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

        /*int results = 1 + 2;
        System.out.println(results);

        int previousResults = results;
        System.out.println(results);

        results = results - 1;
        System.out.println(results);

        System.out.print("previousResults = " + previousResults);
// SPACE ????
        int resultsA = 10;
        resultsA++;
        System.out.println(resultsA);*/


        // Java Types and Expressions


        /*System.out.printf("byte minimum = %s, maximum = %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short minimum = %s, maximum = %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("int minimum = %s, maximum = %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long minimum = %s, maximum = %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("float minimum = %s, maximum = %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double minimum = %s, maximum = %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = 123.456789123456f;
        double d = 123.4567891234568;
        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);

        double result1 = 0.1 * 8;
        double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result1 is %f %n", result1);
        System.out.printf("result2 is %f %n", result2);

        double difference = result1 - result2;
        System.out.printf("The difference is %.99f %n", difference);*/


        // Boolean Expressions

        /*int apples = 18;
        int oranges = 9;

        System.out.println(apples == oranges);
        System.out.println(apples != oranges);

        System.out.printf("%d > %d is %s %n", apples, oranges, apples > oranges);
        System.out.printf("%d < %d is %s %n", apples, oranges, apples < oranges);
        System.out.printf("%d >= %d is %s %n", apples, oranges, apples >= oranges);
        System.out.printf("%d <= %d is %s %n", apples, oranges, apples <= oranges);


        double applePrice = 12.60;
        double orangePrice = 4.50;
        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) || (applePrice > orangePrice));*/


        // Boolean Variables

        /*int apples = 6;
        int oranges = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;

        boolean moreApples;
        boolean applesAreDearer;

        moreApples = (apples > oranges);
        applesAreDearer = (applePrice > orangePrice);
        System.out.printf("We have more apples: %s %n", moreApples);
        System.out.printf("Apples are dearer: %s %n", applesAreDearer);*/

    }

    // Classes, Members and Fields


    public class Car {

        private int speed = 0;

        public void accelerate() {
            speed++;
            System.out.println("You are going %d kilometres per hour. %n" + speed);
        }

        public void brake() {
            speed--;
            System.out.println("You are going %d kilometres per hour. %n" + speed);

        }

        /*public static void main(String[] args) {

            Car myCar = new Car();
            Car anotherCar = new Car();

            myCar.accelerate();
            myCar.accelerate();
            myCar.accelerate();
            myCar.accelerate();
            myCar.brake();
            myCar.accelerate();

            anotherCar.brake();
        }*/
    }
}


