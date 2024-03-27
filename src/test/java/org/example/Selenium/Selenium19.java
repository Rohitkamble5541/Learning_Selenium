package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19 {


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
    public void TestPositive() throws InterruptedException {

        driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2499334.m570.l1313&_nkw=macmini&_sacat=58058");
        driver.manage().window().maximize();
        WebElement inputinsert = driver.findElement(By.cssSelector("input#gh-ac"));
        inputinsert.sendKeys("macmini");
        WebElement serachbtnclick = driver.findElement(By.cssSelector("input#gh-btn"));
        serachbtnclick.click();

        //wait
        Thread.sleep(3000); // We will replace in future.

        List<WebElement> searchedTitles = driver.findElements(By.className("s-item__title"));
       // int i =0;
        for (WebElement title : searchedTitles){
            System.out.println(title.getText());
//            if (i==10){
//               // title.click();
//            }
//            i++;
        }

    }

    @AfterTest
    public  void closeBrowser()
    {
        driver.quit();
    }
}


