package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Selenium13 {

    @Test(groups = "QA")
        @Description("TC#1 (Negative) - Invalid username, Pass - Error message")
        public void testVWOlogin13 () {
            WebDriver driver = new ChromeDriver();
            //1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
            driver.get("https://app.vwo.com/#/login");
            // Question - Print all the anchor Tags on this vwo.com
            // a tags and print the getText

        List<WebElement> all_atags = driver.findElements(By.tagName("a"));
        all_atags.get(0).click(); // Start free trial
        all_atags.get(1).click(); // 2nd One -vwo insights
        all_atags.size(); // 2

        for (WebElement element : all_atags)
        {
            System.out.println(element.getText());
        }


        driver.close();


        }
    }

