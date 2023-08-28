package ro.deloitte.Selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


public class handling_Multiple_Windows {
    protected WebDriver driver;

    public handling_Multiple_Windows() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("http://www.naukri.com/");
        Thread.sleep(3000);
// It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
        }
//switch to the parent window
        driver.switchTo().window(parent);
        Thread.sleep(1000);
        driver.quit();
    }
}