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

public class Step_Definition_exercise_03 {
    protected WebDriver driver;
    public Step_Definition_exercise_03(){
        driver = DriverManager.getDriver();
    }

    @Given ("I access OrangeHRM page for exercise 03")
    public void accessPage_03(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When("I enter valid login credentials for exercise 03")
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

    @And("I press the Login button to log into my account for exercise 03")
    public void pressLoginButton() {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).
                click();
    }

    @And("I click the Leave link from the menu")
    public void clickTheLeaveLinkFromTheMenu() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")).click();
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();
    }

    @And("I select the Rejected status from the 'Show Leave with Status' section")
    public void selectRejectedStatus() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Rejected')]")).click();

        //First step
        /*driver.switchTo().frame("ifFrameResult");
        WebElement w = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));
        Select dropdown = new Select(w);
        dropdown.selectByIndex(0);*/

        //Second try
        /*WebElement dropdown = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
        Select selectObject = new Select(dropdown);
        //selectObject.selectByIndex(1);
        selectObject.selectByVisibleText("Rejected");*/

        //Third try
        /*String expectedOptions[] = { "Rejected", "Cancelled", "Pending Approval", "Scheduled", "Taken"};

        WebElement dropDown = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));

        Select sel = new Select(dropDown);
        List<WebElement> options = sel.getOptions();

        for(int i = 0; i < options.size(); i++){
            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
        }*/

        //Select drpCountry = new Select(driver.findElement(By.xpath("//form[1]/div[1]/div/div[3]/i[1]")));
        //drpCountry.selectByVisibleText("Rejected");

        //Select drpCountry = new Select(driver.findElement(By.xpath("//form[1]/div[1]/div/div[3]/div[1]/div[2]/div/div[role='listbox']")));
        //Select drpCountry = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")));

    }

    @Then("I check that the Rejected status is present as a selection by using XPath selector")
    public void doubleCheck(){

        String actualName = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/span[2]")).getText();
        System.out.println("Actual name is" + actualName);
        String expectedName = "Rejected";
        System.out.println("Expected name is:" + expectedName);
        Assert.assertEquals(actualName, expectedName);

    }

}
