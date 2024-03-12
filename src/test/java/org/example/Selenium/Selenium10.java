package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10 {


   @Test(groups = "QA")
   @Description ("Verify the current url and title of the vwo app")
    public void testVWOLogin()
    {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
         driver.getTitle();
         driver.getCurrentUrl();

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

    }
}
