package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium21 {

    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0
    WebDriver driver;

    @BeforeTest
    public  void openBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);


    }


    @Test(groups = "QA")
    @Description("Test case Description")
    public void TestNegative() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Implicitly wait
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // Global wait to all the elements which we don't use

        WebElement username = driver.findElement(By.cssSelector("input#login-username"));
        username.sendKeys("rohit.kamble.world@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input#login-password"));
        //password.sendKeys("Rohit5541@");
        password.sendKeys("Rohit554145@");
        WebElement submitbtn = driver.findElement(By.cssSelector("button#js-login-btn"));
        submitbtn.click();

        WebElement errormsg = driver.findElement(By.cssSelector("div#js-notification-box-msg"));

        // Explicitly wait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(errormsg,"Your email, password, IP address or location did not match"));

        System.out.println("->"+errormsg.getText());






    }



    @AfterTest
    public  void closeBrowser()
    {
        driver.quit();
    }
}




