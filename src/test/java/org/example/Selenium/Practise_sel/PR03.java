package org.example.Selenium.Practise_sel;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PR03 {

    @Test(groups = "PR")
    @Description ("Launch Url and enter user name and password")
    @Owner("Rohit")
    public void SwagLabs()
    {
        WebDriver driver = new ChromeDriver();

        // launch url
        driver.get("https://www.saucedemo.com/");

        // enter username using tagname
        List<WebElement> username = driver.findElements(By.tagName("input"));
        username.get(1);

        // enter password
        List<WebElement> passwordtxt = driver.findElements(By.tagName("input"));
        passwordtxt.get(2);

        // click on submit button
        List<WebElement> submitbtn = driver.findElements(By.tagName("input"));
        submitbtn.get(3);

        driver.close();




    }
}
