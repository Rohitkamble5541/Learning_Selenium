package org.example.Selenium.Practise_sel;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PR04 {
    @Test(groups = "PR")
    @Description("Launch Url and enter user name and password")
    @Owner("Rohit")
    public void SwagLabs02() {

        WebDriver driver = new ChromeDriver();

        // launch url
        driver.get("https://www.saucedemo.com/");

        // locate user name -- tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        // locate password - tag[attribute=value]
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
        // locate login button using tag.value of class name
        driver.findElement(By.cssSelector("input.submit-button")).click();


        driver.close();




    }



}

