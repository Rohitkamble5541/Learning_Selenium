package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium16 {


    @Test(groups = "QA")
    @Description("Cura health care login")
    public void CURAHealthcareLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        // <a

        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">
        // Make Appointment

        // </a>


        WebElement btnElement_id = driver.findElement(By.id("btn-make-appointment"));
        //WebElement btnElement_CN = driver.findElement(By.className("btn.btn-dark.btn-lg"));
        //WebElement btnElement_PTEXt = driver.findElement(By.partialLinkText("Make"));
        //WebElement btnElement_LTEXt = driver.findElement(By.linkText("Make Appointment"));
        //WebElement btnElement_AT = driver.findElement(By.xpath("//a[@href='./profile.php#login']"));
        //WebElement btnElement_TagName = driver.findElement(By.tagName("a")); // Multiple a tag - Not recommended


        btnElement_id.click();
        // Wait for 2 sec
        Thread.sleep(2000);
        // Assert The Current URL -> https://katalon-demo-cura.herokuapp.com/profile.php#login
        String getcurrenturl = driver.getCurrentUrl();
        Assert.assertEquals(getcurrenturl, "https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // enter username and password

        // <input
        // type="text"  -> NR
        // class="form-control"  -> NR
        // id="txt-username" -> R
        // name="username" -> R
        // placeholder="Username" -> R
        // value="" -> NR
        // autocomplete="off" -> NR
        // fdprocessedid="qxe5em"
        // >

        //WebElement UsernameTxt = driver.findElement(By.id("txt-username"));
        List<WebElement> UsernameTxt = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        UsernameTxt.get(1).sendKeys("John Doe");
        //driver.findElement(By.xpath("//input[@fdprocessedid=\"c9dcd\"]")).sendKeys("John Doe");

        //<input
        // type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value=""
        // autocomplete="off"
        // fdprocessedid="s6xb7o">


        WebElement PasswordTxt = driver.findElement(By.xpath("//input[@id='txt-password']"));
        PasswordTxt.sendKeys("ThisIsNotAPassword");


        // click on login button
        WebElement loginbtn = driver.findElement(By.id("btn-login"));
        loginbtn.click();

        driver.quit();


    }
}