package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {

    //        **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

    // 2. **Find the Email id** and enter the email as admin@admin.com
    //  id, className, name, css Selector, xpath
    //  LinkText and PartialText which are onlu for <a>
    // <input
    // type="email"
    // class="text-input W(100%)"
    // name="username"
    // id="login-username"
    // data-qa="hocewoqisi">


    @Test(groups = "QA")
    @Description ("TC#1 (Negative) - Invalid username, Pass - Error message")
    public  void testVWOlogin()
    {
        WebDriver driver = new ChromeDriver();
        //1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        // verify now  title and current url

        Assert.assertEquals(driver.getTitle() , "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //2. **Find the Email id** and enter the email as admin@admin.com

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");

        // 3. **Find the pass inputbox** and enter passwrod as admin.

        driver.findElement(By.name("password")).sendKeys("admin");

        // 4. Find and Click on the submit button
        driver.findElement(By.id("js-login-btn")).click();


        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // 5. Verify that the error message is shown "Your email, password,
        // IP address or location did not match"

        WebElement actualerroemsg = driver.findElement(By.className("notification-box-description"));

        // <div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match
        // </div>
        String errormsg_text = actualerroemsg.getText();
        String error_msg_data_qa = actualerroemsg.getAttribute("data-qa");
        System.out.println(error_msg_data_qa);

       Assert.assertEquals(errormsg_text,"Your email, password, IP address or location did not match");

driver.quit(); // Stop the session and edge browser which is opened.

    }
}
