package org.example.ex01selenium_basics;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium05_WebDriver {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

    }
}
