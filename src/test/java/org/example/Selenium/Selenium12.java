package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium12 {

    // Locators
    // 1. ID, ClassName , Name , bytag F(n)-> GetText and GetAttribute (Webelements)
    // 2. LinkkText & Partial Text
    // 3. Css Selectors
    // 4. Xpath


    @Test(groups = "QA")
    @Description("TC#1 (Negative) - Invalid username, Pass - Error message")
    public void testVWOlogin() {
        WebDriver driver = new ChromeDriver();
        //1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://app.vwo.com/#/login");

        //WebElement anchor_tag = driver.findElement(By.linkText("Start a free trial"));
        WebElement anchor_tag = driver.findElement(By.partialLinkText("Start a free "));
        System.out.println(anchor_tag.getAttribute("href"));
        anchor_tag.click();
        driver.close();
    }
}
