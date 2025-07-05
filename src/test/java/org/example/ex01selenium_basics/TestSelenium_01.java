package org.example.ex01selenium_basics;

import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium_01 {
    @Test
    public void test_openVWOLoginPage(){

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        System.out.println(edgeDriver.getTitle());
    }

}
