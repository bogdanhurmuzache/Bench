package ro.deloitte.Cucumber2023;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ro.deloitte.Selenium.DriverManager;


public class Step_Definition {
        protected WebDriver driver;

        public Step_Definition(){
                driver = DriverManager.getDriver();
        }

        @Given("Customer navigates to the website")
        public void navigateToWebsite() throws InterruptedException {
                driver.get("https://www.emag.ro/");
                driver.manage().window().maximize();
                Thread.sleep(1000);
        }

        @And("Customer login to his account")
        public void customerLogin(){
                //driver.findElement(By.xpath("//a[@id='my_account']")).click();

        }

        @When("customer searches for laptop")
        public void searchForLaptop() throws InterruptedException {
                driver.findElement(By.xpath("//input[@id='searchboxTrigger']")).sendKeys("laptop");
                driver.findElement(By.xpath("//body/div[4]/nav[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/button[2]/i[1]")).
                        click();
                Thread.sleep(1000);
        }

        @And("clicks on add to cart button")
        public void clickAddToCart() throws InterruptedException {
                driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/section[1]/div[1]/div[3]/div[2]/div[5]/div[2]/div[1]/div[1]/div[4]/div[2]/form[1]/button[1]")).
                        click();
                //driver.findElement(By.xpath("//div[@id=\"card_grid\"]//div[contains(@class, \"card-item\")]//button[@type=\"submit\"][1]")).
                //        click();

                Thread.sleep(1000);
        }

        @Then("Customer is redirected to cart page")
        public void redirectionToCartPage() throws InterruptedException {
                driver.findElement(By.xpath("//a[contains(text(),'Vezi detalii cos')]")).click();
                Thread.sleep(1000);
        }

        @And("Customer is able to click the place order button")
        public void clickPlaceOrderButton() throws InterruptedException {
                driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).
                        click();
                Thread.sleep(2000);

                driver.quit();
        }
    }



