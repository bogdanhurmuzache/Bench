package ro.deloitte.Selenium;

/*1. Void dismiss(): This method is used when the ‘Cancel’ button is clicked in the alert box.

driver.switchTo().alert().dismiss();
2. Void accept(): This method is used to click on the ‘OK’ button of the alert.

driver.switchTo().alert().accept();
3. String getText(): This method is used to capture the alert message.

driver.switchTo().alert().getText();
4. Void sendKeys(String stringToSend): This method is used to send data to the alert box.

driver.switchTo().alert().sendKeys("Text");*/


import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ALerts {
    protected WebDriver driver;

    public ALerts(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {

        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        System.out.println(alertMessage); // Print Alert Message



        Thread.sleep(4000);

        driver.quit();

    }
}
