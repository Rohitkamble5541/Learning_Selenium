package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium17 {

    // Atomic Test Cases
    // TC who don't have any dependencies
    // They serve single purpose 0

    WebDriver driver;

    @BeforeTest
    public  void openBrowser()
    {
        driver = new ChromeDriver();
    }


    @Test(groups = "QA")
    @Description("Cura health care login")
    public void CURAHealthcareLogin() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

    }

    @AfterTest
    public  void closeBrowser()
    {
        driver.quit();
    }
}
