package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class handling_Multiple_Windows_2 {
    protected WebDriver driver;

    public handling_Multiple_Windows_2() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(3000);

        String firstWindow = driver.getWindowHandle(); // Will capture the windows base
        Thread.sleep(3000);

        driver.findElement(By.linkText("Open a popup window")).click(); // OPen a new window
        Thread.sleep(3000);

        // switch to the new window
        // close the new open window
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> itr = windows.iterator();

        while (itr.hasNext()){
            String window = itr.next();
            driver.switchTo().window(window);

            if(driver.getTitle().equals("basic_web_page")){
                driver.close();
            }
        }

        driver.switchTo().window(firstWindow); // line 22

        driver.findElement(By.name("q")).sendKeys("Arun");
        Thread.sleep(10000);
        driver.close();

        Thread.sleep(10000);
        driver.quit();
    }
}
