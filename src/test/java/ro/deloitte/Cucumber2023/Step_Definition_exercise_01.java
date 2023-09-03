package ro.deloitte.Cucumber2023;

/*Given I access OrangeHRM page
When I enter invalid login credentials
And I press the Login button to log into my account
Then I verify that an appropriate message is displayed for invalid credentials*/

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ro.deloitte.Selenium.DriverManager;

public class Step_Definition_exercise_01 {
    protected WebDriver driver;

    public Step_Definition_exercise_01(){
        driver = DriverManager.getDriver();
    }

    @Given("I access OrangeHRM page")
    public void navigateToWebsite() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When("I enter invalid login credentials")
        public void something() {
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                    click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys("Something");

            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).
                click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).
                sendKeys("Nothing");
        }

    @And("I press the Login button to log into my account")
    public void somethingelse() {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).
                click();
    }

    @Then("I verify that an appropriate message is displayed for invalid credentials")
    public  void nothing() {
        String element = String.valueOf(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]")));
        String expected_text = "Invalid credentials";
        Assert.assertEquals(element, expected_text);
    }

}
