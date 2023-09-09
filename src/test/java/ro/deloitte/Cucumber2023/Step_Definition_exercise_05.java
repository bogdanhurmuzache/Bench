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

public class Step_Definition_exercise_05 {
    protected WebDriver driver;
    public Step_Definition_exercise_05(){
        driver = DriverManager.getDriver();
    }


    @And ("I click the Add Attachments button")
    public void clickTheAddAttachementsButton(){
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")).click();
    }

    @And("I select to upload a file")
    public void selectToUploadAFile() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scroll(0,400)");*/

        driver.findElement(By.xpath("//div[contains(text(),'Browse')]")).
                sendKeys("//Users//bhurmuzache//Desktop//Upload a file.docx");
    }

    @And ("I add a comment for this document uploaded in the comment field")
    public void addAComment(){
        driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).click();
        driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("comment");
    }

    @And ("I press the Save button for this attachment added")
    public void pressSaveButtonAttachementAdded(){
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        /*List<WebElement> buttons = driver.findElements(By.xpath("//button[@type='submit']"));
        if (buttons.size() >= 2) {
            buttons.get(1).click(); // Faceți clic pe a doua instanță
        } else {
            System.out.println("Nu s-au găsit suficiente elemente.");
        }*/
    }

    @Then("I am able to see my document added in the record found section by using css selector")
    public void seeMyDOcumentAdded(){
        String actualNameOfTheDocument = driver.findElement(By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div.orangehrm-edit-employee-content div.orangehrm-attachment div.orangehrm-container:nth-child(4) div.oxd-table div.oxd-table-body div.oxd-table-card div.oxd-table-row.oxd-table-row--with-border div.oxd-table-cell.oxd-padding-cell:nth-child(2) > div:nth-child(1)")).
                getText();
        System.out.println("Fisierul uploadat se numeste: " + actualNameOfTheDocument);

        String expectedNameOfTheDocument = "Upload a file.docx";
        System.out.println("Fisierul uploadat ar trebui sa se numeasca: " + expectedNameOfTheDocument);

        Assert.assertEquals(actualNameOfTheDocument, expectedNameOfTheDocument);
    }
}
