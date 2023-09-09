package ro.deloitte.Cucumber2023;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ro.deloitte.Selenium.DriverManager;

import java.time.Duration;

public class Step_Definition_exercise_04 {
    protected WebDriver driver;
    public Step_Definition_exercise_04(){
        driver = DriverManager.getDriver();
    }

    @Given("I access OrangeHRM page for exercise 04")
    public void accessPage_04(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When("I enter valid login credentials for exercise 04")
    public void enterValidLoginCredentials(){
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys("Admin");

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).
                click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).
                sendKeys("admin123");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).
                click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @And("I click the My Info option from the menu for exercise 04")
    public void clickMyInfoButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")).click();
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
        //driver.findElement(By.partialLinkText("My Info")).click();
        //driver.findElement(By.cssSelector("a[class*='oxd-main-menu-item']")).click();
        //driver.findElement(By.cssSelector("span[class*='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
        //driver.findElement(By.id("svgg")).click();

        /*WebElement elements = driver.findElement(By.xpath("oxd-text oxd-text--span oxd-main-menu-item--name"));
        int numElements = elements.size();
        if (elements.size() >= 2) {
            elements.get(1).click();
        } else {
            System.out.println("Nu exista suficiente elemente pentru a face clic pe al doilea.");
        }*/

        //driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
        //driver.findElement(By.xpath("//*[contains(text(), 'My Info\")]")).click();
    }
    @And("I click on the Contact Details link which will redirect me to the contactDetails page for exercise 04")
    public void clickContactDetailsButton(){
        driver.findElement(By.xpath("//a[contains(text(),'Contact Details')]")).click();
    }

    @And("I update the Street 1 field from contact details for exercise 04")
        public void updateStreet1() {
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Carol 1");


    }

    @And("I select Algeria as country")
    public void selectCountry(){
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[2]/div[4]")).click();
    }

    @And("I press the Save button")
    public void pressSaveButton(){
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
    }

    @Then("I should see the successfully updated confirmation message")
    public void seeUpdatedConfirmationMessage(){
        String actualCheck = driver.findElement(By.xpath("//body/div[@id='app']/div[@id='oxd-toaster_1']/div[1]")).getText();
        System.out.println("actulaCheck is:" + actualCheck);
        String expectedCheck = "Success\n" +
                "Successfully Updated";
        System.out.println("expectedCheck is:" + expectedCheck);
        Assert.assertEquals(actualCheck, expectedCheck);
    }
}

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));