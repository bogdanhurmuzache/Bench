package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

    protected WebDriver driver;

    public Practice(){
        driver = DriverManager.getDriver();
    }
    @Test
    public void Test() throws InterruptedException {

        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        /*driver.get("https://login.yahoo.com/?lang=ro-RO&src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F&add=1");
        Thread.sleep(3000);
        String textInainte = driver.findElement(By.id("login-signin")).getAttribute("value");
        System.out.println(textInainte);*/


        /*driver.findElement(By.cssSelector("input[name=\"username\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");*/


        /*String textUsername = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][@name='username']")).
                getAttribute("placeholder");
        System.out.println(textUsername);*/

        //driver.findElement(By.name("username")).sendKeys("Admin");
        /*driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys("Admin");*/
        /*driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys("Admin");*/

 /*       driver.findElement(By.cssSelector("input[name=\"password\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).
                getText();
        System.out.println(text);

        */

        Thread.sleep(4000);

        driver.quit();
    }

}

