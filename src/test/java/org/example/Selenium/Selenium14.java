package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium14 {

    @Test(groups = "QA")
    @Description("TC#1 (Negative) - Invalid username, Pass - Error message")
    public void testVWOlogin14() {
        WebDriver driver = new ChromeDriver();
        //1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://app.vwo.com/#/login");



    }

}
