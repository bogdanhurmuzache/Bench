package ro.deloitte.Cucumber2023;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ro.deloitte.Selenium.DriverManager;

public class Step_Definition_exercise_02 {
    protected WebDriver driver;
    public Step_Definition_exercise_02(){

        driver = DriverManager.getDriver();
    }
    @Given ("I access OrangeHRM page_exercise02")
    public void accessWebPage()  {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When ("I enter valid login credentials")
    public void enterValidLoginCredentials(){
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys("Admin");

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).
                click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).
                sendKeys("admin123");
    }

    @And ("I press the Login button to log into my account_exercise_02")
    public void pressTheLoginButton() {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).
                click();
    }


    @Then ("I verify that I am logged into my account by checking that the username is displayed in the navigation bar in the right corner of the application by using XPath selector")
    public void verifyIfItsLoggedOrNot(){
        String actualUsername = driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).getText();
        System.out.println("checkUsername is:" + actualUsername);

        String expectedUsername = "Paul Collings";
        System.out.println("expectedUsername is:" + expectedUsername);

        Assert.assertEquals(actualUsername, expectedUsername);
    }

}
