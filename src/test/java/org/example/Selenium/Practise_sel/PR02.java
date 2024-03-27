package org.example.Selenium.Practise_sel;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR02 {

    @Test(groups = "PR")
    @Description ("Launch Url and enter user name and password")
    @Owner("Rohit")
    public void SwagLabs()
    {
        WebDriver driver = new ChromeDriver();

        // launch url
        driver.get("https://www.saucedemo.com/");

        // enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // enter password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        // click on submit button
        driver.findElement(By.className("submit-button")).click();

        // switch to product page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);
        // click on sauce labs bolt t-shirt
        driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();





    }
}
