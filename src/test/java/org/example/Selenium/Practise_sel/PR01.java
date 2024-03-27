package org.example.Selenium.Practise_sel;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR01 {


    @Test(groups = "PR")
    @Description("Launch google url and get page title and current url")
    public void Launchurl()
    {
        // create instance of chromedriver
        WebDriver driver = new ChromeDriver();
        //launch google site
        driver.get("https://www.google.com/");

        //capture current url
        System.out.println("Current utl:-"+driver.getCurrentUrl());

        //capture title
        System.out.println("Title Page:-"+driver.getTitle());

        // capture page source
        System.out.println("Page source is:-"+driver.getPageSource());

        driver.close();



    }
}
