package org.example.ex01selenium_basics;



import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_03 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {

        // Selenium 3
// Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");


    }


}
