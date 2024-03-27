package org.example.Selenium.Practise_sel;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practical01 {

    // login vwo web site

    @Test
    @Description ("login vwo sites ")
    public void vwologin()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.getCurrentUrl();

        // Print title and currenturl
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());

        // Verify user land on the current page and url
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        // Enter username and password

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("js-login-btn")).click();

        // wait for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // now validate the erroe msg
        String errormsg = driver.findElement(By.className("notification-box-description")).getText();
        Assert.assertEquals(errormsg ,"Your email, password, IP address or location did not match");


driver.quit();

    }
}
