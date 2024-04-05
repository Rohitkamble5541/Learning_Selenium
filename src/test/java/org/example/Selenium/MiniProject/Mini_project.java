package org.example.Selenium.MiniProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.print.attribute.HashAttributeSet;
import java.util.List;

public class Mini_project {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String URL = "https://katalon-demo-cura.herokuapp.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        WebElement MakeAppointmentbtn = driver.findElement(By.id("btn-make-appointment"));
        MakeAppointmentbtn.click();

        WebElement Usernametxt = driver.findElement(By.id("txt-username"));
        Usernametxt.sendKeys("John Doe");

        WebElement Passwordtxt = driver.findElement(By.id("txt-password"));
        Passwordtxt.sendKeys("ThisIsNotAPassword");

        WebElement Loginbtn = driver.findElement(By.id("btn-login"));
        Loginbtn.click();

        // dropdwon select seoual

        WebElement element_select= driver.findElement(By.id("combo_facility"));
        Select select = new Select(element_select);
        select.selectByVisibleText("Seoul CURA Healthcare Center");

        //checkbox
        List <WebElement> Checkboxes = driver.findElements(By.xpath("//label[@for='chk_hospotal_readmission']"));
        WebElement ch1 = Checkboxes.get(0);
        ch1.click();

        // radio buttons
        WebElement  healthcare_pro_radio_btn = driver.findElement(By.id("radio_program_none"));
        healthcare_pro_radio_btn.click();

        // enter calender date
        WebElement  Visit_Date = driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        Visit_Date.sendKeys("28/3/2024");

        // comment
        WebElement  comment = driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
        comment.sendKeys(" Hello Autoamtion 123");

        // Book Appointment
        WebElement book_Appointment = driver.findElement(By.id("btn-book-appointment"));
        book_Appointment.click();

        //Appointment confirmation message
        WebElement gettitle = driver.findElement(By.xpath("//p[@class='lead']"));
        gettitle.getText();


        // verify confirmation
        WebElement confirmcommentmsg = driver.findElement(By.xpath("//p[@id='comment']"));
        String conmessage = confirmcommentmsg.getText();
        //System.out.println(conmessage);
        Assert.assertEquals(conmessage , "Hello Autoamtion 123");


    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
