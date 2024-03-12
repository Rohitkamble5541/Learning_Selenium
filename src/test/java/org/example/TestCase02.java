package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    @Description ("Verify title of the The testing Academy website.")
    public void vwoLogin()
    {
        // Selenium - Arch
        // Write the code - Client - java - python, ruby, perl ,php
        //


        WebDriver driver = new EdgeDriver();
        {
            // WebDriver driver2 = new ChromeDriver();
            //1. Create session -> BOX -> Connect with Browser via the HTTP Methods
            //2. Session ID - 16 alpha digit -
            //3. driver -> ref -> functions -> driver.get()-> HTTP Command -> Open a URL ("")
            //4. driver.command()-> API (GET , POST , PATCH)-> webdriver w3c document
            //5. Flow / Arch of selenium 4()
            //code (java - python, ruby, perl ,php,C#) ->
            // w3c (protocol (in built in browser)-> (in 3.x)-> JSON Wire protocol (APIs) Which are not inbuilt in browsers
            // Servers (ChromeDrivers)->
            // Chrome Browser, Edge Browser , IE Browser
            driver.get("https://thetestingacademy.com/");
            System.out.println(driver.getTitle());

        }

    }
}
